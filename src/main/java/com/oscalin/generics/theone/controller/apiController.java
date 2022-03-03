package com.oscalin.generics.theone.controller;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.service.FunctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/api")
public class apiController {
    private FunctionServiceImpl functionService;

    @Autowired
    public void autoWired(FunctionServiceImpl functionService) {
        this.functionService = functionService;
    }

    @GetMapping("/menu")
    @ResponseBody
    public Map<String, List<Function>> getMenu() {
        return functionService.findAllMap();
    }
}
