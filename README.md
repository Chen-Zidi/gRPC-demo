# gRPC-demo
a small example of gRPC

## How to run

Start Server Application

Start client Application


Open localhost:8082/list a list of employees is sent

Each time of execution, the client will print
the response time in `Duration.between(sendTime, receiveTime).toMillis()`


## Data in .proto


Empty: empty request

Employee: id, firstname, lastname, salary, Address

Address: country, state, houseNo(string), street, city

EmployeeList: a list of employees, by default the server gives four employees in the list.

1,"Jack","Tim",300, Sweden, Stockholm, Stockholm, nameless, 1

2,"Bob","Seif",1000, Sweden, Stockholm, Stockholm, nameless, 2

3,"Mina","Trump",500, Sweden, Stockholm, Stockholm, nameless, 3

4,Alice","Madison",800, Sweden, Stockholm, Stockholm, nameless, 4



