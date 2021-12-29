package com.oscalin.generics.theone.controller;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.service.FunctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class indexController {
    private FunctionServiceImpl functionService;
    @Autowired
    public void autoWired(FunctionServiceImpl functionService) {
        this.functionService = functionService;
    }

    @GetMapping({"/", "/index"})
    public String indexPage() {
        return "index";
    }

    @GetMapping("/user_list")
    public String usersPage() {
        return "pages/user_list";
    }

    @GetMapping("/group_setting")
    public String groupPage() {
        return "pages/group_setting";
    }

    @GetMapping("/task_list")
    public String taskListPage() {
        return "pages/task_list";
    }

    @GetMapping("/task_chart")
    public String taskChartPage() {
        return "pages/task_chart";
    }

    @GetMapping("/output_update")
    public String outputUpdatePage() {
        return "pages/output_update";
    }

    @GetMapping("/api/menu")
    @ResponseBody
    public  List<Function> getMenu() {
        return functionService.findAll();
    }

}
