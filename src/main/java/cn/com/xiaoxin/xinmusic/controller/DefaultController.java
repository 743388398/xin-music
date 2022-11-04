package cn.com.xiaoxin.xinmusic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultController {
    @RequestMapping
    public String sayHello() {
        return "欢迎";
    }
}
