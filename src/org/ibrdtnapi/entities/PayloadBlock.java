package org.ibrdtnapi.entities;

import java.lang.Exception;
import java.util.logging.Logger;
import java.util.Base64;

public class PayloadBlock {
	private static final Logger log = Logger.getLogger(Bundle.class.getName());
	private String encoded = null;
	private byte[] decoded = null;
	
	public PayloadBlock(String encoded) {
		this.setEncoded(encoded);
	}

	public PayloadBlock(byte[] decoded) {
		this.setDecoded(decoded);
	}

	public PayloadBlock(PayloadBlock payloadBlock) {
		this(payloadBlock.getEncoded());
	}

	public String getEncoded() {
		return this.encoded;
	}

	public byte[] getDecoded() {
		return this.decoded;
	}

	public int getLength() {
		return decoded.length;
	}

	public void setEncoded(String encoded) {
		this.encoded = new String(encoded);
		try {
			this.decoded = Base64.getDecoder().decode(this.encoded);
			//.getDecoder().decode(this.encoded);
		} catch (Exception e) {
			PayloadBlock.log.warning("Could not base64::decode() the payload of the bundle:" + this + ". " + e.getMessage());
		}
	}

	private void setDecoded(byte[] decoded) {
		this.decoded = new byte[decoded.length];
		System.arraycopy(decoded, 0, this.decoded, 0, decoded.length);
		this.encoded = new String(Base64.getEncoder().encode(this.decoded)).trim();
	}

	public String toString(boolean full) {

		StringBuilder str = new StringBuilder();
		str.append(((this.getLength() == 0) ? "X" : this.getLength()) + ":");
		str.append("" + new String(this.decoded).trim());
		if (full) {
			str.append("#" + this.encoded + "#");
		}
		return str.toString();
	}

	public String toString() {
		return this.toString(false);
	}
}
