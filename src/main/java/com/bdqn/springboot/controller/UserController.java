package com.bdqn.springboot.controller;

import com.bdqn.springboot.pojo.User;
import com.bdqn.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/user")
    public String getUser(HttpSession session){
        List<User> userList = userService.getAllUser();
        session.setAttribute("userList",userList);
        return "index";
    }
}
