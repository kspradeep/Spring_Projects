package com.extreme.grpcpoc;

import com.google.protobuf.InvalidProtocolBufferException;
import example.simple.Simple;
import example.simple.SimpleMessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SimpleMessageClient {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloWorldClient.class);

    private SimpleMessageServiceGrpc.SimpleMessageServiceBlockingStub simpleMessageServiceBlockingStub;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6789).usePlaintext().build();

        simpleMessageServiceBlockingStub =
                SimpleMessageServiceGrpc.newBlockingStub(managedChannel);
    }

    public String getMessage() throws InvalidProtocolBufferException {
        example.simple.Simple.SimpleMessage simpleMessage = example.simple.Simple.SimpleMessage.newBuilder().setId(50)
                .setIsSimple(true)
                .setName("My simple proto buffer example").build();
        Simple.GetMessage getMessage =
                simpleMessageServiceBlockingStub.saySimple(simpleMessage);
        String json = com.google.protobuf.util.JsonFormat.printer().print(getMessage);
        return json;
    }
}


