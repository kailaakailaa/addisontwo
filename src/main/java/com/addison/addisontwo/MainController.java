package com.addison.addisontwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    
                                        
    @GetMapping("/")
    public String login(){
        return "addison/index";
    }
    
    @GetMapping("/addison/mystory")
    public String next(){
        return "addison/mystory";
    }

    @GetMapping("/addison/tips")
    public String tip(){
        return "addison/tips";
    }
   
}

