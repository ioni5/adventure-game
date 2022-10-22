package io.github.ioni5;

public class Game {
    
    public void start() throws InterruptedException {
        Console console = new Console();
        console.writeWithDelay("\nYou find yourself standing in an open field, filled with grass and yellow wildflowers.");
        console.writeWithDelay("\nRumor has it that a wicked fairie is somewhere around here, and has been terrifying the nearby village.");
        
        console.write("\nEnter 1 to knock on the door of the house. ");
        console.write("\nEnter 2 to peer into the cave.");
        console.write("\nWhat would you like to do?\n");
        int option = 0;
        boolean error = false;
        do {
            option = console.readInt("(Please enter 1 or 2): ");
            error = option != 1 && option != 2;
        } while (error);
    }
}
