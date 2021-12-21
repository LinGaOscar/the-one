package com.oscalin.generics.theone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/index")
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
}
