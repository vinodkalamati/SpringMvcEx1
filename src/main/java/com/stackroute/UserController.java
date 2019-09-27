package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    User user=new User("Vinod");
//    @RequestMapping(value = "hello",method = RequestMethod.GET)
//    public String getuser(ModelMap model){
//        model.addAttribute("user",user.getName());
//        System.out.println(user.getName());
//        return "hello";
//
//    }



    @RequestMapping("users")
    public ModelAndView Greeting(){
//        String username=request.getParameter("uname");
//        String password=request.getParameter("pwd");
        User user=new User("Vinod");
        ModelAndView MV = new ModelAndView();
        MV.setViewName("users");
        MV.addObject("user",user.getName());
        return MV;
    }

//    @GetMapping("users")
//    public ModelAndView passParametersWithModelAndView() {
//        ModelAndView modelAndView = new ModelAndView("users");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//
//    }





}
