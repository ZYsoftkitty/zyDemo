package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/10 21:32.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
@RequestMapping("/FMController")
public class FMController {

    @RequestMapping("/testFreeMarker")
    public String testFreeMarker(Model model){
        model.addAttribute("name","张宇");
        return "freemarker";
    }

    @RequestMapping("/testFreeMarker1")
    public String testFreeMarker1(Map<String,Object> map){
        map.put("name","张宇");
        return "freemarker";
    }
}
