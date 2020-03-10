package com.extreme.grpcpoc;

import example.simple.Simple;
import example.simple.SimpleMessageServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class SimpleMessageServiceImpl extends SimpleMessageServiceGrpc.SimpleMessageServiceImplBase {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SimpleMessageServiceImpl.class);

    @Override
    public void saySimple(example.simple.Simple.SimpleMessage request,
                          StreamObserver<Simple.GetMessage> responseObserver) {
        LOGGER.info("server received {}", request);

        String message = "Hello " + request.getName() + " "
                + request.getId() + "!";
        Simple.GetMessage getMessage =
                Simple.GetMessage.newBuilder().setMessage(message).build();
        LOGGER.info("server responded {}", getMessage);

        responseObserver.onNext(getMessage);
        responseObserver.onCompleted();
    }
}
