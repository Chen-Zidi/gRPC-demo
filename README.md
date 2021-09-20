# gRPC-demo
a small example of gRPC

## How to run

Start Server Application

Start client Application

Open localhost:8082 "Hello World" String is sent to the client

Open localhost:8082/list a list of employees is sent

Each time of execution, the client will print
the response time in `Duration.between(sendTime, receiveTime).toMillis()`

The first time of execution seems extremely long, which I think can be ignored.


## Data in .proto

HelloRequest: request with a name, client gives "Michael" by default

HelloReply: server gives "Hello World"

Empty: empty request

Employee: id, firstname, lastname, salary

EmployeeList: a list of employees, by default the server gives four employees in the list.

1,"Jack","Tim",300

2,"Bob","Seif",1000

3,"Mina","Trump",500

4,Alice","Madison",800



