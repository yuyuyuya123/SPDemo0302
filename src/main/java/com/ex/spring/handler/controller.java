package com.ex.spring.handler;

import com.ex.spring.service.DeptServiceImpl;
import com.ex.spring.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class controller {

    @Autowired
    DeptServiceImpl deptService;

    @RequestMapping("/get_data")
    public ModelAndView get_data(){
        System.out.println("-----------进入了映射方法--------");
        List<Dept> list = deptService.getAll();
        System.out.println("==========查询完了结果==============");
        ModelAndView mv=new ModelAndView();
        mv.addObject("all",list);
        mv.setViewName("success");
        System.out.println("************设置好了model**********");
        return mv;
    }

    @RequestMapping("/ajax_1_hanlder")
    @ResponseBody
    public ModelAndView one(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","tangyu");
        mv.setViewName("success");
        return mv;
    }
}
