package com.example.exam_44_calc;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MathContoller {
    @Autowired
    public MathService service;
    @GetMapping("/hi")
    public String show(Model model){
        Entity_Math entityMath1 = new Entity_Math();
        List<Entity_Math> list = service.listAll();
        model.addAttribute("list", list);
        model.addAttribute("entityMath1", entityMath1);
        return "welcome";
    }
    @PostMapping("/welcome")
    public String showSave(Model model, @ModelAttribute("math") Entity_Math entityMath){
        service.save(entityMath);
        return "redirect:/hi";
    }


}
