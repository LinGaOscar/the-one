package com.oscalin.generics.theone.entity.service;

import com.oscalin.generics.theone.entity.domain.Function;

import java.util.List;
import java.util.Map;

public interface FunctionService {
    Function saveFunction(Function function);
    Function upDateFunction(Function function);
    List<Function> findAll();
}
