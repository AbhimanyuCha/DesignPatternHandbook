package com.structural.adapter.exampleService;

import java.util.List;

public interface ExternalService {
    List<String> fetch();
    Boolean update();
}
