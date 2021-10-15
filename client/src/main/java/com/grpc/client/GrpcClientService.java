package com.grpc.client;

import com.grpc.common.HelloGrpc;
import com.grpc.common.HelloOuterClass;
import org.springframework.stereotype.Service;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

//    public String sendMessage(String name) {
//        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
//        Instant inst1 = Instant.now();
//        HelloOuterClass.HelloReply response = stub.sayHello(HelloOuterClass.HelloRequest.newBuilder().setName(name).build());
//        Instant inst2 = Instant.now();
//        double diff = Duration.between(inst1, inst2).toMillis();
//        System.out.println("response time:" + diff);
//        return response.getMessage();
//
//    }

    public String listEmployees() {
        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
        HelloOuterClass.EmployeeList response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());

        Instant inst1 = Instant.now();
        for(int i = 0; i < 100; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        Instant inst2 = Instant.now();
        double diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 100:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 200; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 200:" + diff);

        inst1 = Instant.now();
        for(int i = 0; i < 300; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 300:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 400; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 400:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 500; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 500:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 600; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 600:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 700; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 700:" + diff);

        inst1 = Instant.now();
        for(int i = 0; i < 800; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 800:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 900; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 900:" + diff);


        inst1 = Instant.now();
        for(int i = 0; i < 1000; i ++){
            response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        }
        inst2 = Instant.now();
        diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time 1000:" + diff);

        return response.getEmployeesList().toString();

    }

}
