package com.example.controller;
import com.example.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    private Car car;
    public CarController(){
        this.car = new Car();
    }

   @GetMapping ("/cars")
    public String get(Model model, @RequestParam(name="distance", required = false) Integer distance) {
        if (distance != null){
            car.drive(distance);
        }
        model.addAttribute("msgList", car.getOut().getMessageList());
        model.addAttribute("car", car);
        return "car";
    }

    @GetMapping ("/cars/stop")
    public String get(Model model){
        car.stop ();
        model.addAttribute("msgList", car.getOut().getMessageList());
        model.addAttribute("car", car);
        return "car";
    }

    @GetMapping ("/cars/supply")
    public String supply(Model model, @RequestParam(name="fuel", required = false) Integer fuel){
        car.setFuel (car.getFuel()+fuel);
        model.addAttribute("addfuel", car.refill(fuel));
        model.addAttribute("msgList", car.getOut().getMessageList());
        model.addAttribute("car", car);
        return "car";
    }
}
