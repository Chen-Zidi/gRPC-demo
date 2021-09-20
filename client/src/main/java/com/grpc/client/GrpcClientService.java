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

    public String sendMessage(String name) {
        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
        Instant inst1 = Instant.now();
        HelloOuterClass.HelloReply response = stub.sayHello(HelloOuterClass.HelloRequest.newBuilder().setName(name).build());
        Instant inst2 = Instant.now();
        double diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time:" + diff);
        return response.getMessage();

    }

    public String listEmployees() {
        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
        Instant inst1 = Instant.now();
        HelloOuterClass.EmployeeList response = stub.listEmployees(HelloOuterClass.Empty.newBuilder().build());
        Instant inst2 = Instant.now();
        double diff = Duration.between(inst1, inst2).toMillis();
        System.out.println("response time:" + diff);
        return response.getEmployeesList().toString();

    }

}
