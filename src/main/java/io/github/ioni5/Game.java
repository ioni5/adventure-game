package io.github.ioni5;

public class Game {

    private Player player;

    public Game() {
        player = new Player();
    }
    
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
        switch (option) {
            case 1:
                console.writeWithDelay("\nYou approach the door of the house.");
                console.writeWithDelay("\nYou are about to knock when the door opens and out steps a troll.");
                console.writeWithDelay("\nEep! This is the troll's house!");
                console.writeWithDelay("\nThe troll attacks you!");

                error = false;
                do {
                    option = console.readInt("\nWould you like to (1) fight or (2) run away? ");
                    error = option != 1 && option != 2;
                } while (error);
                switch (option) {
                    case 1:
                        if (player.hasItem("Sword of Ogoroth")) {
                            console.writeWithDelay("\nAs the troll moves to attack, you unsheath your new sword.");
                            console.writeWithDelay("\nThe Sword of Ogoroth shines brightly in your hand");
                            console.writeWithDelay("\nas you brace yourself for the attack.");
                            console.writeWithDelay("\nBut the troll takes one look at your shiny ");
                            console.writeWithDelay("\nnew toy and runs away!");
                            console.writeWithDelay("\nYou have rid the town of the troll.");
                            console.writeWithDelay("\nYou are victorious!");
                            console.writeWithDelay("\nThe Sword of Ogoroth shines brightly in your hand ");
                            console.writeWithDelay("\nas you brace yourself for the attack.");
                            console.writeWithDelay("\nBut the troll takes one look at your shiny ");
                            console.writeWithDelay("\nnew toy and runs away!");
                            console.writeWithDelay("\nYou have rid the town of the troll.");
                            console.writeWithDelay("\nYou are victorious!");
                        } else {
                            console.writeWithDelay("\nYou do your best...");
                            console.writeWithDelay("\nbut your dagger is no match for the troll.");
                            console.writeWithDelay("\nYou have been defeated!");
                        }
                        break;
                    case 2:
                        console.writeWithDelay("\nYou run back into the field. Luckily, you don't seem ");
                        console.writeWithDelay("\nto have been followed.");
                        break;
                }
                
                break;
            case 2:
                console.writeWithDelay("\nYou peer cautiously into the cave.");
                console.writeWithDelay("\nIt turns out to be only a very small cave.");
                if  (player.hasItem("\nSword of Ogoroth")) {
                    console.writeWithDelay("\nYou've been here before, and gotten all the good stuff.");
                    console.writeWithDelay("\nIt's just an empty cave now.");
                } else {
                    console.writeWithDelay("\nYour eye catches a glint of metal behind a rock.");
                    console.writeWithDelay("\nYou have found the magical Sword of Ogoroth!");
                    console.writeWithDelay("\nYou discard your silly old dagger and take the sword with you.");
                    player.addItem("Sword of Ogoroth");
                }
                break;
        }
    }
}
