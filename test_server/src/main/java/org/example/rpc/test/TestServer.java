package org.example.rpc.test;

import org.example.rpc.server.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(new HelloServiceImpl(), 9000);
    }
}
