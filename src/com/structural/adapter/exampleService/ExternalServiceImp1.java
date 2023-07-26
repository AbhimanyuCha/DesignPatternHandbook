package com.structural.adapter.exampleService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExternalServiceImp1 implements ExternalService{
    @Override
    public List<String> fetch() {
        return Arrays.asList("3213", "1231", "11", "22");
    }

    @Override
    public Boolean update() {
        return null;
    }
}
