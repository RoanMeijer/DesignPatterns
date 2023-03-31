package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardHandler {
    Game game;

    public KeyboardHandler(Game game){
        this.game = game;
    }

    public void giveStateOptions(){
        ArrayList<String> options = game.getCurrentState().getOptions();

        for (int i = 1; i <= options.size(); i++) {
            System.out.println("Select " + i + " for " + options.get(i - 1));
        }
        Scanner scanner = new Scanner(System.in);

        try {
            int selectedOption = Integer.parseInt(scanner.nextLine());

            if (selectedOption < 1 || selectedOption > 4) {
                throw new IndexOutOfBoundsException();
            }

            System.out.println("you have selected option " + selectedOption + " : " + options.get(selectedOption - 1));
            selectedOption(selectedOption);
        } catch (Exception e) {
            System.out.println("Please enter a valid number within the range of 1 - 4");
            giveStateOptions();
        }
    }

    public void selectedOption(int optionSelected) {
        switch (optionSelected) {
            case 1 -> game.getCurrentState().pressButton1(game);
            case 2 -> game.getCurrentState().pressButton2(game);
            case 3 -> game.getCurrentState().pressButton3(game);
            default -> game.getCurrentState().pressButton4(game);
        };
    }
}
