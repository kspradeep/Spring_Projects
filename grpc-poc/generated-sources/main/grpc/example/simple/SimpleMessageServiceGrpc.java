package example.simple;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.1.2)",
    comments = "Source: simple.proto")
public class SimpleMessageServiceGrpc {

  private SimpleMessageServiceGrpc() {}

  public static final String SERVICE_NAME = "example.simple.SimpleMessageService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<example.simple.Simple.SimpleMessage,
      example.simple.Simple.GetMessage> METHOD_SAY_SIMPLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "example.simple.SimpleMessageService", "saySimple"),
          io.grpc.protobuf.ProtoUtils.marshaller(example.simple.Simple.SimpleMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(example.simple.Simple.GetMessage.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleMessageServiceStub newStub(io.grpc.Channel channel) {
    return new SimpleMessageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleMessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SimpleMessageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleMessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SimpleMessageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SimpleMessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saySimple(example.simple.Simple.SimpleMessage request,
        io.grpc.stub.StreamObserver<example.simple.Simple.GetMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_SIMPLE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_SIMPLE,
            asyncUnaryCall(
              new MethodHandlers<
                example.simple.Simple.SimpleMessage,
                example.simple.Simple.GetMessage>(
                  this, METHODID_SAY_SIMPLE)))
          .build();
    }
  }

  /**
   */
  public static final class SimpleMessageServiceStub extends io.grpc.stub.AbstractStub<SimpleMessageServiceStub> {
    private SimpleMessageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleMessageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleMessageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleMessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void saySimple(example.simple.Simple.SimpleMessage request,
        io.grpc.stub.StreamObserver<example.simple.Simple.GetMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_SIMPLE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SimpleMessageServiceBlockingStub extends io.grpc.stub.AbstractStub<SimpleMessageServiceBlockingStub> {
    private SimpleMessageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleMessageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleMessageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleMessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.simple.Simple.GetMessage saySimple(example.simple.Simple.SimpleMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_SIMPLE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimpleMessageServiceFutureStub extends io.grpc.stub.AbstractStub<SimpleMessageServiceFutureStub> {
    private SimpleMessageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleMessageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleMessageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleMessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.simple.Simple.GetMessage> saySimple(
        example.simple.Simple.SimpleMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_SIMPLE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_SIMPLE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleMessageServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SimpleMessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_SIMPLE:
          serviceImpl.saySimple((example.simple.Simple.SimpleMessage) request,
              (io.grpc.stub.StreamObserver<example.simple.Simple.GetMessage>) responseObserver);
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

  private static final class SimpleMessageServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.simple.Simple.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SimpleMessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleMessageServiceDescriptorSupplier())
              .addMethod(METHOD_SAY_SIMPLE)
              .build();
        }
      }
    }
    return result;
  }
}
