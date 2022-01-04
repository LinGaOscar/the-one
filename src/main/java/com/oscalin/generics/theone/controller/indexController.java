package com.oscalin.generics.theone.controller;

import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.service.FunctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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
    public Map<String, List<Function>> getMenu() {

        List<Function> functionList = functionService.findAll();

        Map<String, List<Function>> functionMap = functionService.findAllMap();

//        Map<Long, Function> transactionMap = functionList.stream()
//                .collect(Collectors.toMap(Function::getFunctionId, Function.identity()));
//
//        List sortedlist = new ArrayList();
//
//
//
//        List sortedMenu1 = new ArrayList();
//        List sortedMenu2 = new ArrayList();
//        List sortedMenu3 = new ArrayList();
//        functionList.forEach(element -> {
//            if (element.getMenuLevel() == 2) {
//                switch (element.getUpLevel()) {
//                    case "system_setting":
//                        sortedMenu1.add(element);
//                        break;
//                    case "task_setting":
//                        sortedMenu2.add(element);
//                        break;
//                    case "report_output":
//                        sortedMenu3.add(element);
//                        break;
//                }
//            }
//        });
//
//        sortedMenu1.sort(Comparator.comparing(Function::getSortNo));
//        sortedMenu2.sort(Comparator.comparing(Function::getSortNo));
//        sortedMenu3.sort(Comparator.comparing(Function::getSortNo));
//
//        functionList.forEach(element -> {
//            if(element.getFunctionId() ==""){
//
//            }
//            if (element.getMenuLevel() == 1) {
//                sortedlist.add(element);
//            }
//        });
//        System.out.println(sortedlist);
//        sortedlist.sort(Comparator.comparing(Function::getSortNo));
//        System.out.println(sortedlist);




        return functionMap;
    }

}
