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
        List<Dept> list = deptService.getAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("all",list);
        mv.setViewName("success");
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
