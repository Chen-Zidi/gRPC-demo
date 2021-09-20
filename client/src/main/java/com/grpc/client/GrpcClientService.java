package com.grpc.client;

import org.springframework.stereotype.Service;
import com.grpc.common.*;
import com.grpc.common.HelloOuterClass;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
        HelloOuterClass.HelloReply response = stub.sayHello(HelloOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }

}
