package org.example.rpc.test;

import org.example.rpc.registry.DefaultServiceRegistry;
import org.example.rpc.registry.ServiceRegistry;
import org.example.rpc.server.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.registry(new HelloServiceImpl());
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
