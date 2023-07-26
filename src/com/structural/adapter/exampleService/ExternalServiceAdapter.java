package com.structural.adapter.exampleService;

import java.util.List;

public interface ExternalServiceAdapter{
    //The interface which our client uses

    List<Integer> getDetails();

}
