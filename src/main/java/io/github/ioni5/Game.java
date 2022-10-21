package io.github.ioni5;

public class Game {
    
    public void start() throws InterruptedException {
        Console console = new Console();
        console.write("You find yourself standing in an open field, filled with grass and yellow wildflowers.");
        Thread.sleep(2000);
        console.write("Rumor has it that a wicked fairie is somewhere around here, and has been terrifying the nearby village.");
    }
}
