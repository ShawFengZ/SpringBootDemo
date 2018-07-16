package cn.toroot.controller;

import cn.toroot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cn.toroot.model.User;

@RestController
@RequestMapping("etc")
public class UserController {
    @RequestMapping("/hello")
    public String hello(){

        return "String";
    }

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public void addUser(User user){
        userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "find")
    public User findByPrimaryKey(int id){
        return userService.findByPrimaryKey(id);
    }
}
