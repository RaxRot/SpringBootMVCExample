package com.raxrot.springbootmvcexample.Controller;

import com.raxrot.springbootmvcexample.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/addUser")
    public ModelAndView add(@ModelAttribute User user, ModelAndView mv){

        mv.addObject("myUser",user);
        mv.setViewName("result");
        return mv;
    }

     /*@PostMapping("/add")

    public ModelAndView add(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            ModelAndView mv){

        int result = num1 + num2;

        mv.addObject("totalResult",result);
        mv.setViewName("result");
        return mv;
    }
    */


}
