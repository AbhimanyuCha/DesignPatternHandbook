package com.structural.adapter.exampleService;

import java.util.List;
import java.util.stream.Collectors;

public class ConcreteAdapter1 implements ExternalServiceAdapter{

    ExternalService service;
    public ConcreteAdapter1(ExternalService service){
        this.service = service;
    }
    @Override
    public List<Integer> getDetails() {
        return service.fetch().stream().map(i -> Integer.valueOf(i)).collect(Collectors.toList());
    }
}
