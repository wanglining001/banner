package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 王立宁
 * @create 2020-05-09
 * 类描述：
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String start(){
        return "hello,java";
    }
}
