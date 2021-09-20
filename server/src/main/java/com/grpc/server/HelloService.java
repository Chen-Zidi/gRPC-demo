package com.grpc.server;


import com.grpc.common.HelloGrpc;
import com.grpc.common.HelloOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService(HelloOuterClass.class)
public class HelloService extends HelloGrpc.HelloImplBase{

    @Override
    public void sayHello(HelloOuterClass.HelloRequest request, StreamObserver<HelloOuterClass.HelloReply> responseObserver) {
        String message = "Hello World!";
        final HelloOuterClass.HelloReply.Builder replyBuilder = HelloOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        System.out.println("Returning " +message);
    }
}
