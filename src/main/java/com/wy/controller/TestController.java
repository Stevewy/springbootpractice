package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangYao
 * @date 2020/12/29
 * @function 首页
 */

@Controller
public class TestController {

    @RequestMapping("/test")
    public String index(Model model){
        model.addAttribute("msg","hello!");
        return "test";
    }
}
