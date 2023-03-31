package com.company;

import java.util.Random;

public class GameDialog {
    public GameDialog(){

    }

    public void PrintWelcomeMessage(){
        System.out.println("================================================================================");
        System.out.println("================================================================================");
        System.out.println("\u001B[33m" + "oooooooooo.                       o8o                                        \n" +
                "`888'   `Y8b                      `\"'                                        \n" +
                " 888      888  .ooooo.   .oooo.o oooo   .oooooooo ooo. .oo.                  \n" +
                " 888      888 d88' `88b d88(  \"8 `888  888' `88b  `888P\"Y88b                 \n" +
                " 888      888 888ooo888 `\"Y88b.   888  888   888   888   888                 \n" +
                " 888     d88' 888    .o o.  )88b  888  `88bod8P'   888   888                 \n" +
                "o888bood8P'   `Y8bod8P' 8\"\"888P' o888o `8oooooo.  o888o o888o                \n" +
                "                                       d\"     YD                             \n" +
                "                                       \"Y88888P'                             \n" + "\u001B[34m " +
                "                                                                            \n" +
                "                         .       .                                           \n" +
                "                       .o8     .o8                                           \n" +
                "oo.ooooo.   .oooo.   .o888oo .o888oo  .ooooo.  oooo d8b ooo. .oo.    .oooo.o \n" +
                " 888' `88b `P  )88b    888     888   d88' `88b `888\"\"8P `888P\"Y88b  d88(  \"8 \n" +
                " 888   888  .oP\"888    888     888   888ooo888  888      888   888  `\"Y88b.  \n" +
                " 888   888 d8(  888    888 .   888 . 888    .o  888      888   888  o.  )88b \n" +
                " 888bod8P' `Y888\"\"8o   \"888\"   \"888\" `Y8bod8P' d888b    o888o o888o 8\"\"888P' \n" +
                " 888                                                                         \n" +
                "o888o                                                                        \n" +
                "                                                                             " + "\u001B[0m");
        System.out.println("================================================================================");
        System.out.println("================================================================================");
        System.out.println("Welcome to the train simulation game");
        System.out.println("First choose the character you want to play during the game:");
    }

    public void printStartGameMessage(){
        System.out.println("********The game will start********");
    }

    public void printGetOnTrainMessage(String compartment){
        System.out.println("You  running late to the train station, but you have an important meeting and you can't miss this train!");
        waitMilliSeconds(500);
        System.out.println("You look at the ticket machine and quickly buy a ticket and run to your train.");
        waitMilliSeconds(500);
        System.out.println("Your train is about to leave so you jump in the first compartment you see.");
        waitMilliSeconds(500);
        System.out.println("you look around and notice that you are in a " + compartment);
        waitMilliSeconds(500);
        System.out.println("Your ride stars of peacefully.");
    }

    public void printIdleTrainNoise(){
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            switch (random.nextInt(6)) {
                case 1 -> System.out.println("Rumble Rumble");
                case 2 -> System.out.println("Rumble Rumble Rumble");
                case 3 -> System.out.println("Rumble");
                case 4 -> System.out.println("Choo Choo");
                case 5 -> System.out.println("Rumble Choo Rumble");
            }

            waitMilliSeconds(500);
        }
    }

    private void waitMilliSeconds(int i){
        try {
            Thread.sleep(i);
        }catch (Exception e){

        }
    }
}
