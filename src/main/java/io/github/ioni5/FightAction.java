package io.github.ioni5;

public class FightAction extends Action {

    @Override
    public void start(Scenary scenary, Player player) {
        if (player.hasItem("Sword of Ogoroth")) {
            console.write(new String[]{
                "\nAs the troll moves to attack, you unsheath your new sword.",
                "\nThe Sword of Ogoroth shines brightly in your hand",
                "\nas you brace yourself for the attack.",
                "\nBut the troll takes one look at your shiny ",
                "\nnew toy and runs away!",
                "\nYou have rid the town of the troll.",
                "\nYou are victorious!",
                "\nThe Sword of Ogoroth shines brightly in your hand ",
                "\nas you brace yourself for the attack.",
                "\nBut the troll takes one look at your shiny ",
                "\nnew toy and runs away!",
                "\nYou have rid the town of the troll.",
                "\nYou are victorious!\n"
            });
        } else {
            console.write(new String[]{
                "\nYou do your best...",
                "\nbut your dagger is no match for the troll.",
                "\nYou have been defeated!\n"
            });

            player.die();
        }
    }

    @Override
    public String getTitle() {
        return "Fight.";
    }
    
}
