package com.example.Trainer;
import org.springframework.ui.Model;
import com.example.Trainer.Entity.Trainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
    @RequestMapping("/showForm")
    public String showForm(Model themodel) {
        Trainer t =new Trainer();
        themodel.addAttribute("trainer",t);
        return "TrainerRegForm";
        
    }
    @RequestMapping("/confirm")
    public String confirm(@ModelAttribute Trainer Trainertemp,Model themodel){
        System.out.println(Trainertemp);
        themodel.addAttribute("trainer",Trainertemp);
        return "Confirmation";

    }
}
