package io.github.ioni5;

public class FightAction extends Action {

    private String enemy;

    public FightAction(Scenary scenary, String enemy) {
        super(scenary);
        this.enemy = enemy;
    }

    @Override
    public void start(Player player) {
        if (player.hasItem("Sword of Ogoroth")) {
            console.write(new String []{
                "\nAs the %s moves to attack, you unsheath your new sword.",
                "\nThe Sword of Ogoroth shines brightly in your hand",
                "\nas you brace yourself for the attack.",
                "\nBut the %s takes one look at your shiny ",
                "\nnew toy and runs away!",
                "\nYou have rid the town of the %s.",
                "\nYou are victorious!",
                "\nThe Sword of Ogoroth shines brightly in your hand ",
                "\nas you brace yourself for the attack.",
                "\nBut the %s takes one look at your shiny ",
                "\nnew toy and runs away!",
                "\nYou have rid the town of the %s.",
                "\nYou are victorious!\n"
            }, enemy);
        } else {
            console.write(new String[]{
                "\nYou do your best...",
                "\nbut your dagger is no match for the %s.",
                "\nYou have been defeated!\n"
            }, enemy);

            player.die();
        }
    }

    @Override
    public String getTitle() {
        return "Fight.";
    }
    
}
