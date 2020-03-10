package com.extreme.grpcpoc.controller;

import com.extreme.grpcpoc.HelloWorldClient;
import com.extreme.grpcpoc.SimpleMessageClient;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/grpc/poc", produces = "application/json")
public class HelloWordController {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @Autowired
    private SimpleMessageClient simpleMessageClient;

    @RequestMapping(value = "/hello")
    public ResponseEntity<Object> getHello() {

        return new ResponseEntity<>(helloWorldClient.sayHello("Extreme", "EVM"), HttpStatus.OK);
    }
    @RequestMapping(value = "/message")
    public ResponseEntity<Object> getMessage() throws InvalidProtocolBufferException {

        return new ResponseEntity<>(simpleMessageClient.getMessage(), HttpStatus.OK);
    }
}
