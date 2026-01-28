package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloConteroller {
    // 代码对齐快捷键是 Ctrl+Alt+L
    // 允许来自 http://localhost:5173 的跨域请求
    // @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hello2")
    public String hello2() {
        System.out.println("hello world2");
        return "hello world2";
    }

    // 参数传递方式不改变请求方法的类型—— 只要请求方法是 POST，哪怕参数正确，@GetMapping也会拒绝匹配。
    @GetMapping("/hello3")
    public String hello3(@RequestParam("id") Long id, @RequestParam("name") String name) {
        System.out.println("id=" + id + " name=" + name);
        return "hello world3";
    }

    @PostMapping("/hello4")
    public String hello4(@RequestParam("id") Long id, @RequestParam("name") String name) {
        System.out.println("id=" + id + " name=" + name);
        return "hello world4";
    }
}