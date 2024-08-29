package org.example.rpc.api;


public interface HelloService {
    /**
     * 服务提供的接口
     * @param object
     * @return
     */
    String hello(HelloObject object);
}
