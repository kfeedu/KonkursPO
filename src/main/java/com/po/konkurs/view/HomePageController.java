package com.po.konkurs.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {
    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public String login(Model model, String error, String logout){
        if(error != null){
            model.addAttribute("error", "Your username and password are invalid");
        }

        if(logout != null){
            model.addAttribute("message", "You have been logged out succesfully");
        }

        return "login";
    }

    @RequestMapping(value = {"/pu1"}, method = RequestMethod.GET)
    public String pu1() {
        return "pu1_base_details";
    }

    @RequestMapping(value = {"/id_confirm"}, method = RequestMethod.GET)
    public String pu1_id_confirm() {
        return "pu1_id_confirm";
    }

}
