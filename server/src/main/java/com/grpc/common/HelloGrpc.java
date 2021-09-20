package com.grpc.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: hello.proto")
public final class HelloGrpc {

  private HelloGrpc() {}

  public static final String SERVICE_NAME = "Hello";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.HelloRequest,
      com.grpc.common.HelloOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.grpc.common.HelloOuterClass.HelloRequest.class,
      responseType = com.grpc.common.HelloOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.HelloRequest,
      com.grpc.common.HelloOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.HelloRequest, com.grpc.common.HelloOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = HelloGrpc.getSayHelloMethod) == null) {
      synchronized (HelloGrpc.class) {
        if ((getSayHelloMethod = HelloGrpc.getSayHelloMethod) == null) {
          HelloGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.grpc.common.HelloOuterClass.HelloRequest, com.grpc.common.HelloOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Hello", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.common.HelloOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.common.HelloOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.Empty,
      com.grpc.common.HelloOuterClass.EmployeeList> getListEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listEmployees",
      requestType = com.grpc.common.HelloOuterClass.Empty.class,
      responseType = com.grpc.common.HelloOuterClass.EmployeeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.Empty,
      com.grpc.common.HelloOuterClass.EmployeeList> getListEmployeesMethod() {
    io.grpc.MethodDescriptor<com.grpc.common.HelloOuterClass.Empty, com.grpc.common.HelloOuterClass.EmployeeList> getListEmployeesMethod;
    if ((getListEmployeesMethod = HelloGrpc.getListEmployeesMethod) == null) {
      synchronized (HelloGrpc.class) {
        if ((getListEmployeesMethod = HelloGrpc.getListEmployeesMethod) == null) {
          HelloGrpc.getListEmployeesMethod = getListEmployeesMethod = 
              io.grpc.MethodDescriptor.<com.grpc.common.HelloOuterClass.Empty, com.grpc.common.HelloOuterClass.EmployeeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Hello", "listEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.common.HelloOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.common.HelloOuterClass.EmployeeList.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloMethodDescriptorSupplier("listEmployees"))
                  .build();
          }
        }
     }
     return getListEmployeesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloStub newStub(io.grpc.Channel channel) {
    return new HelloStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.grpc.common.HelloOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void listEmployees(com.grpc.common.HelloOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.EmployeeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListEmployeesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.common.HelloOuterClass.HelloRequest,
                com.grpc.common.HelloOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getListEmployeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.common.HelloOuterClass.Empty,
                com.grpc.common.HelloOuterClass.EmployeeList>(
                  this, METHODID_LIST_EMPLOYEES)))
          .build();
    }
  }

  /**
   */
  public static final class HelloStub extends io.grpc.stub.AbstractStub<HelloStub> {
    private HelloStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.grpc.common.HelloOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEmployees(com.grpc.common.HelloOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.EmployeeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEmployeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloBlockingStub extends io.grpc.stub.AbstractStub<HelloBlockingStub> {
    private HelloBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.common.HelloOuterClass.HelloReply sayHello(com.grpc.common.HelloOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.common.HelloOuterClass.EmployeeList listEmployees(com.grpc.common.HelloOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListEmployeesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloFutureStub extends io.grpc.stub.AbstractStub<HelloFutureStub> {
    private HelloFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.common.HelloOuterClass.HelloReply> sayHello(
        com.grpc.common.HelloOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.common.HelloOuterClass.EmployeeList> listEmployees(
        com.grpc.common.HelloOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListEmployeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LIST_EMPLOYEES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.grpc.common.HelloOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.HelloReply>) responseObserver);
          break;
        case METHODID_LIST_EMPLOYEES:
          serviceImpl.listEmployees((com.grpc.common.HelloOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.common.HelloOuterClass.EmployeeList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.common.HelloOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Hello");
    }
  }

  private static final class HelloFileDescriptorSupplier
      extends HelloBaseDescriptorSupplier {
    HelloFileDescriptorSupplier() {}
  }

  private static final class HelloMethodDescriptorSupplier
      extends HelloBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getListEmployeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
