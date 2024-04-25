package com.example.colorguessinggame.service;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ColorService {

    //Atributes
    private List<String> colors = Arrays.asList("Red", "Blue", "Green", "Yellow", "Orange", "Purple");
    private Random random = new Random();
    private String currentColor;

    public List<String> getColors() {
        return colors;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    /*
    * Randomly selects a color from the list
    * @return the selected color
    * */
    public String getRandomColor () {
        currentColor = colors.get(random.nextInt(colors.size()));
        System.out.println(currentColor);
        return currentColor;
    }

    /*
    * Validates the user's guess against the selected color
    * it returns true if the guess is correct, otherwise false*/

    public boolean validateGuess (String guess) {
        return guess!=null && guess.equalsIgnoreCase(currentColor) ;
    }

}
