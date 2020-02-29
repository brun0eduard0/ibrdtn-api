IBRDTN-API
==========

use os seguintes comandos no ubuntu

# Compilação de Exemplo

## Receiver  

### Compilação  -  Terminal A

```bash
cd src/org/ibrdtnapi/example/neighbor
javac -cp ../../../../../../ibrdtn-api-master/ Receiver.java 
```
### Execução  -  Terminal B

```bash
java -classpath src/ org.ibrdtnapi.example.neighbor.Receiver
```


## Sender

### Compilação  -  Terminal A

```bash
cd src/org/ibrdtnapi/example/
javac -cp ../../../../src/ Sender.java
```
### Execução  -  Terminal B

```bash
java -classpath src/ org.ibrdtnapi.example.Sender
```

## TestNetwork

### Compilação  -  Terminal A

```bash
cd src/org/ibrdtnapi/example/
javac -cp ../../../../src/ TestNetwork.java
```
### Execução  -  Terminal B

```bash
java -classpath src/ org.ibrdtnapi.example.TestNetwork
```
