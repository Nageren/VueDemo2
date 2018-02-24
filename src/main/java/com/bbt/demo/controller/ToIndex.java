package com.bbt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mawenlei on 2018/2/24.
 */
@Controller
public class ToIndex {
    //跳转到首页
    @RequestMapping("/index")
    public String  toIndex(){
        return "index";
    }
}
