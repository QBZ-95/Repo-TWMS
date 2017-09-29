package com.gree.twms.controller.login;


import com.gree.twms.pojo.User;
import com.gree.twms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/twms")
@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/logging")
    public String logging(HttpServletRequest request, User user){
        String msg = "";
        if(user.getPid().equals("")||user.getPwd().equals("")){
            msg = "用户名或密码不能为空！";
            request.setAttribute("msg",msg);
            return "login";
        }else{
            User result = userService.selectIsValidUser(user);
            if(result==null){
                msg = "用户名或密码错误！";
                request.setAttribute("msg",msg);
                return "login";
            }else{
                request.getSession().setAttribute("userInfo",result);
                User user1= (User) request.getSession().getAttribute("userInfo");
                return "index";
            }
        }
    }
    //跳转登录页面
    @RequestMapping("/login")
    public  String login(){
        return "login";
    }

    //退出登录
    @RequestMapping("/loginOut")
    public  String loginOut(){
        return "login";
    }

    //跳转到用户管理界面
    @RequestMapping("/user-manage")
    public  String userManage(){
        return "user-manage";
    }

    //跳转到仓库管理界面
    @RequestMapping("/warehouse-manage")
    public  String warehouseManage(){
        return "warehouse-manage";
    }
}
