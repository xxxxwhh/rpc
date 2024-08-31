package org.example.test;

import org.example.rpc.api.HelloObject;
import org.example.rpc.api.HelloService;
import org.example.rpc.client.RpcClientProxy;

public class TestClient {

    public static void main(String[] args) {
        RpcClientProxy clientProxy = new RpcClientProxy("127.0.0.1", 9000);
        HelloService proxy = clientProxy.getProxy(HelloService.class);
        String hello = proxy.hello(new HelloObject(1, "hello"));
        System.out.println(hello);
    }
}
