package com.example.exam_myuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class UserContoller {

    @Autowired
    public UserService getUserService;
    @GetMapping("/hi")
    public String showPage(Model model){
        List<User> users = getUserService.listAll();
        model.addAttribute("users", users);

        return "welcome";
    }
}
