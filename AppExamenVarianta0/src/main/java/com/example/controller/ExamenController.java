package com.example.controller;

import com.example.Examen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExamenController {
    private Examen examen;
    public ExamenController(){
        this.examen = new Examen ();
    }

    @GetMapping ("/")
    public String get(Model model,  @RequestParam(name="mile", required = false) Float mile){
        if (mile != null){
            examen.convert(mile);
        }
        model.addAttribute ("curentMessage", examen.getCurrentMessage ());
        model.addAttribute ("examen",examen);
        return "examen";
    }
}
