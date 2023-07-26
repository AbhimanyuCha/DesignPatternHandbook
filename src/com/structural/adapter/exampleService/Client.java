package com.structural.adapter.exampleService;

import java.util.List;

public class Client {
    ExternalServiceAdapter service;
    //using constructor injection just provide the adapterVersion which needs to be used for the client
    Client(ExternalServiceAdapter service){
        this.service = service;
    }

    List<Integer> getData(){
        return service.getDetails();
    }
    public static void main(String[] args) {
        Client c1 = new Client(new ConcreteAdapter1(new ExternalServiceImp1()));
        System.out.println(c1.getData());
    }

}
