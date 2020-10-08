package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/*
    @Controller : 返回的是视图，静态页面和动态页面
        不加thymeleaf模板引擎情况下：返回static文件夹下的页面
        加thymeleaf模板引擎情况下：返回的是templates文件夹下的模板，如果想要返回static下的页面，需要重转向
    @Controller+@ResponseBody 或者 @RestController : 返回的是json数据或者字符串
 */
@Controller
public class HelloController {


    // 转到动态模板 hello.html
    @GetMapping("/greeting1")
    public String greeting1(){
        System.out.println("访问greeting1...");
        return "hello.html";
    }

    // 转到动态模板 hello.html
    @GetMapping("/greeting3")
    public String greeting3(){
        System.out.println("访问greeting3...");
        return "hello";
    }

    // 转到动态模板 hello.html
    @GetMapping("/greeting4")
    public String greeting4(Model model){
        model.addAttribute("name", "thymeleaf");
        System.out.println("访问greeting4...");
        return "hello";
    }

    // 错误,找不到模板
    @GetMapping("/greeting5")
    public String greeting5(){
        System.out.println("访问greeting5...");
        return "hello thymeleaf";
    }

    // 转到静态页面hello.html，这是配置了thymeleaf情况下访问静态页面的方法
    @GetMapping("/greeting6")
    public String greeting6(){
        System.out.println("访问greeting6...");
        return "redirect:hello.html";
    }



    // 返回json数据
    @PostMapping("/greeting2")
    @ResponseBody
    public ResponseEntity<Person> greeting2(@RequestBody Person person){
        System.out.println("访问greeting2...");
        System.out.println(person);
        return ResponseEntity.ok(person);
    }

    // 返回的是字符串
    @GetMapping("/greeting7")
    @ResponseBody
    public String greeting7(){
        System.out.println("访问greeting7...");
        return "hello thymeleaf";
    }

    // 返回的是字符串
    @GetMapping("/greeting8")
    @ResponseBody
    public String greeting8(){
        System.out.println("访问greeting8...");
        return "hello";
    }

}
