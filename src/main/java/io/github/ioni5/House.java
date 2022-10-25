package io.github.ioni5;

public class House extends Scenary {

    public House() {
        this.add(new FightAction());
        this.add(new RunawayAction());
    }

    @Override
    protected void start(Player player) {
        Console console = new Console(Game.DELAY);
        console.write(new String[]{
            "\nYou approach the door of the house.",
            "\nYou are about to knock when the door opens and out steps a troll.",
            "\nEep! This is the troll's house!",
            "\nThe troll attacks you!"
        });
        this.actionSelector().start(this, player);
    }

    @Override
    public String getTitle() {
        return "knock on the door of the house.";
    }

}
