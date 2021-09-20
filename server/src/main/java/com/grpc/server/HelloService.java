package com.grpc.server;



import com.grpc.common.HelloGrpc;
import com.grpc.common.HelloOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

import java.util.ArrayList;
import java.util.List;

@GrpcService(HelloOuterClass.class)
public class HelloService extends HelloGrpc.HelloImplBase{

    HelloOuterClass.Employee.Builder e1;
    HelloOuterClass.Employee.Builder e2;
    HelloOuterClass.Employee.Builder e3;
    HelloOuterClass.Employee.Builder e4;
    HelloOuterClass.Employee.Address.Builder address;

    public HelloService(){
        address = HelloOuterClass.Employee.Address.newBuilder().setCity("Stockholm").setState("Stockholm").setCountry("Sweden").setStreet("nameless");
        e1 = HelloOuterClass.Employee.newBuilder().setId(1).setFirstName("Jack").setLastName("Tim").setSalary(300)
            .setAddress(address.setHouseNo("1"));
        e2 = HelloOuterClass.Employee.newBuilder().setId(2).setFirstName("Bob").setLastName("Seif").setSalary(1000)
                .setAddress(address.setHouseNo("2"));
        e3 = HelloOuterClass.Employee.newBuilder().setId(3).setFirstName("Mina").setLastName("Trump").setSalary(500)
                .setAddress(address.setHouseNo("3"));
        e4 = HelloOuterClass.Employee.newBuilder().setId(4).setFirstName("Alice").setLastName("Madison").setSalary(800)
                .setAddress(address.setHouseNo("4"));

    }

    @Override
    public void sayHello(HelloOuterClass.HelloRequest request, StreamObserver<HelloOuterClass.HelloReply> responseObserver) {
        String message = "Hello World!";
        final HelloOuterClass.HelloReply.Builder replyBuilder = HelloOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
//        System.out.println("Returning " +message);
    }

    @Override
    public void listEmployees(HelloOuterClass.Empty request, StreamObserver<HelloOuterClass.EmployeeList> responseObserver) {

        responseObserver.onNext(HelloOuterClass.EmployeeList.newBuilder()
                .addEmployees(e1).addEmployees(e2)
                .addEmployees(e3).addEmployees(e4).build());
        responseObserver.onCompleted();
//        System.out.println("Returning " +message);
    }

}
