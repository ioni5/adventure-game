package io.github.ioni5;

import java.util.Random;

public class House extends Scenary {

    private String enemy;

    public House() {
        enemy = Game.ENEMIES[new Random().nextInt(Game.ENEMIES.length)];
        this.add(new FightAction(this, enemy));
        this.add(new RunawayAction(this));
    }

    @Override
    protected void start(Player player) {
        Console console = new Console(Game.DELAY);
        console.write(new String[]{
            "\nYou approach the door of the house.",
            "\nYou are about to knock when the door opens and out steps a %s.",
            "\nEep! This is the %s's house!",
            "\nThe %s attacks you!"
        }, enemy);
        this.actionSelector().start(player);
    }

    @Override
    public String getTitle() {
        return "Knock on the door of the house.";
    }

}
