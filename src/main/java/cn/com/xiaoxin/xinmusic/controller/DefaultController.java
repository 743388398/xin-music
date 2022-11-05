package cn.com.xiaoxin.xinmusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefaultController {
    @GetMapping
    public String sayHello() {
        return "欢迎!!!";
    }
}
