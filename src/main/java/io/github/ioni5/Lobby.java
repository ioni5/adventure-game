package io.github.ioni5;

public class Lobby extends Scenary {

    @Override
    protected void start(Player player) {
        console.write(new String[] {
            "\nYou find yourself standing in an open field, ",
            "\nfilled with grass and yellow wildflowers.",
            "\nRumor has it that a wicked fairie is somewhere around here, ",
            "\nand has been terrifying the nearby village."
        });
        this.forward(player);
    }

    @Override
    public String getTitle() {
        return null;
    }

}
