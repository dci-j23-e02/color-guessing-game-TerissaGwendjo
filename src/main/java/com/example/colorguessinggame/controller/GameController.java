package com.example.colorguessinggame.controller;

import com.example.colorguessinggame.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes ("correctColor")
public class GameController {

    // Field injection
    @Autowired // autowired just instantiates the object for you so that injects th field from the @Service .
    // That means you will have to annotate the main class as service and the Controller class autowired
    private ColorService colorService;

    @GetMapping ("/")
    public String startGame(Model model) {
        String color = colorService.getRandomColor();
        model.addAttribute("currentColor", color);
        model.addAttribute("colors", colorService.getColors());
        System.out.println("SHOWING HOMPAGE");
        return "index";

    }


    @GetMapping ("/guess")
    public String guess (@RequestParam String guess, Model model) {
        boolean isCorrect = colorService.validateGuess(guess);
        model.addAttribute("message",isCorrect ? "Correct! The color was " + colorService.getCurrentColor() : "Incorrect! Try again.");

        model.addAttribute("isCorrect" , isCorrect);

        System.out.println("SHOWING RESULTS PAGE");
        return "result";
    }


}
