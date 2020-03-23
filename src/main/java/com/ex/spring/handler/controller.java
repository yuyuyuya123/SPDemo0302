package com.ex.spring.handler;

import com.ex.spring.entity.Dept;
import com.ex.spring.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class controller {

    @Autowired
    DeptServiceImpl deptService;

    @RequestMapping("/get_data")
    public ModelAndView get_data(){
        List<Dept> list = deptService.getAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("all",list);
        mv.setViewName("success");
        return mv;
    }

    //测试字符串作为响应数据
    @RequestMapping("/ajaxTest")
    @ResponseBody
    public String str(){
        return "hhhhhhhtestAjaxhhhhh";
    }

    //测试非字符串的基本数据类型作为响应数据，需要在mvc配置文件中配置类型转换器
    @RequestMapping("/ajaxIntTest")
    @ResponseBody
    public int one(){
        return 1;
    }

    //测试前端传来数据，进行AJAX交互
    @RequestMapping("/ajaxInnteraction")
    @ResponseBody
    public Dept ajax_3(@RequestParam("dNo") int dNo){
        Dept dept=new Dept();
        dept.setDno(dNo);
        dept.setDname("public relations");
        dept.setLoc("ZheJiang");
        return dept;
    }

    //测试集合类型的返回值
    @RequestMapping("/ajaxTestList")
    @ResponseBody
    public List<Dept> getList(){
        Dept dept1=new Dept(55,"planning","ShangHai");
        Dept dept2=new Dept(66,"product development","TianJin");
        List<Dept> list=new ArrayList<Dept>();
        list.add(dept1);
        list.add(dept2);
        return  list;
    }

    //测试map类型的返回值
    @RequestMapping("/ajaxTestMap")
    @ResponseBody
    public Map<String,Dept> getMap(){
        Dept dept1=new Dept(77,"Secretarial","BeiJing");
        Dept dept2=new Dept(88,"Admin","TianJin");
        Map<String,Dept> map=new HashMap<>();
        map.put("dept1",dept1);
        map.put("dept2",dept2);
        return map;
    }

    //测试两个ViewResolver配置不同路径的view
    @RequestMapping("/testTwoViewResolver")
    public String testTwoViewResolver(@RequestParam("dname") String dname,Map<String,Dept> map){
        Dept dept=new Dept();
        dept.setLoc("NanJing");
        dept.setDname(dname);
        map.put("dept",dept);
        return "welcome";
    }

}
