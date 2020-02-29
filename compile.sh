#!/bin/bash -xe
#

cd src/org/ibrdtnapi/example/
javac -cp ../../../../src/ Sender.java
javac -cp ../../../../src/ TestNetwork.java
cd neighbor
javac -cp ../../../../../../ibrdtn-api-master/ Receiver.java
 
#gnome-terminal --tab --command="bash -c 'cd src/org/ibrdtnapi/example/; javac -cp ../../../../src/ Sender.java; javac -cp ../../../../src/ TestNetwork.java; cd neighbor; javac -cp ../../../../../../ibrdtn-api-master/ Receiver.java; $SHELL'" 
