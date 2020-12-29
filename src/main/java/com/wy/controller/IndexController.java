package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangYao
 * @date 2020/12/29
 * @function 首页
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
