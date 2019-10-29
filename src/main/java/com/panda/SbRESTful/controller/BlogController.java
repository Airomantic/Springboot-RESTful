package com.panda.SbRESTful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * @program: RESTful
 * @description:
 * @author: jiangzq
 * @create: 2019-10-29 10:44
 **/
@Controller
@RequestMapping("/blog")
public class BlogController {
    @RequestMapping("/{id}")
    public ModelAndView show(@PathVariable("id") Integer id) {
// spring通过@PathVariable注解来获得请求url中的动态参数的，并且支持动态url访问，可以从url中直接提取参数而不需要采用?q=q&d=d的形式
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("blog");
        return modelAndView;
    }

    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value = "q", required = false) String q) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("q", q);
        modelAndView.setViewName("query");
        return modelAndView;
    }
}
