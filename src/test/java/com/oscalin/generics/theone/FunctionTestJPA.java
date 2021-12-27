package com.oscalin.generics.theone;

import com.oscalin.generics.theone.entity.domain.Division;
import com.oscalin.generics.theone.entity.domain.Function;
import com.oscalin.generics.theone.entity.domain.Group;
import com.oscalin.generics.theone.entity.domain.User;
import com.oscalin.generics.theone.entity.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FunctionTestJPA {

    private FunctionRepository functionRepository;

    @Autowired
    public void autoWired(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }

    @Test
    public void add() {

        Function function=new Function();
        function.setFunctionId("sideBars");
        function.setFunctionName("側欄選單");
        function.setIsFolder("Y");
        function.setUpLevel("");
        function.setSortNo("1");

//        function.setFunctionId("system_setting");
//        function.setFunctionName("系統管理");
//        function.setIsFolder("Y");
//        function.setUpLevel("sideBars");
//        function.setSortNo("1");
//
//        function.setFunctionId("task_setting");
//        function.setFunctionName("任務管理");
//        function.setIsFolder("Y");
//        function.setUpLevel("sideBars");
//        function.setSortNo("2");
//
//        function.setFunctionId("report_output");
//        function.setFunctionName("報告輸出");
//        function.setIsFolder("Y");
//        function.setUpLevel("sideBars");
//        function.setSortNo("3");
//
//        function.setFunctionId("user_list");
//        function.setFunctionName("使用者清單");
//        function.setIsFolder("N");
//        function.setUpLevel("system_setting");
//        function.setSortNo("1");
//
//        function.setFunctionId("group_setting");
//        function.setFunctionName("群組設定");
//        function.setIsFolder("N");
//        function.setUpLevel("system_setting");
//        function.setSortNo("2");
//
//        function.setFunctionId("task_chart");
//        function.setFunctionName("報告圖表");
//        function.setIsFolder("N");
//        function.setUpLevel("report_output");
//        function.setSortNo("1");
//
//        function.setFunctionId("task_list");
//        function.setFunctionName("工作清單");
//        function.setIsFolder("N");
//        function.setUpLevel("task_setting");
//        function.setSortNo("1");

        functionRepository.save(function);


    }

    @Test
    public void find() {
        Function function = functionRepository.findById("sideBars").orElse(null);
        System.out.println(function);
    }

}
