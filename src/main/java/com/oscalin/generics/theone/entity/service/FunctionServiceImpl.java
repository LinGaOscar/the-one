package com.oscalin.generics.theone.entity.service;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.repository.FunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

@Service
public class FunctionServiceImpl implements FunctionService {

    private FunctionRepository functionRepository;

    @Autowired
    public void autoWired(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }


    @Override
    public Function saveFunction(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public Function upDateFunction(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public List<Function> findAll() {
        return functionRepository.findAll();
    }

    @Override
    public Map<String,  List<Function>> findAllMap() {
        return functionRepository.findAllMap();
    }
}
