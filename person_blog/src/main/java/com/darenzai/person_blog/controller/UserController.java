package com.darenzai.person_blog.controller;


import com.darenzai.person_blog.common.lang.Result;
import com.darenzai.person_blog.entity.User;
import com.darenzai.person_blog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author darenzai
 * @since 2021-08-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id")Long id){
        return userService.getById(id);
    }
    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user=userService.getById(1L);
        return Result.succ(user);
    }
    @PostMapping("/save")
    public  Result save(@Validated @RequestBody User user){
        return Result.succ(user);
    }

}
