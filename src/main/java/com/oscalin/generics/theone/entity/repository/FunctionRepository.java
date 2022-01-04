package com.oscalin.generics.theone.entity.repository;

import com.oscalin.generics.theone.entity.domain.Function;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface FunctionRepository extends JpaRepository<Function,String> {

    default Map<String, List<Function>> findAllMap() {
        Map<String, List<Function>> formats =  findAll().stream()
                .sorted(Comparator.comparing(Function::getSortNo))
                .collect(Collectors.groupingBy(Function::getUpLevel));

        return formats;
    }
}
