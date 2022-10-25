package io.github.ioni5;

public class Cave extends Scenary {

    @Override
    protected void start(Player player) {
        console.write(new String[] {
            "\nYou peer cautiously into the cave.",
            "\nIt turns out to be only a very small cave."
        });

        if (player.hasItem("Sword of Ogoroth")) {
            console.write(new String[] {
                "\nYou've been here before, and gotten all the good stuff.",
                "\nIt's just an empty cave now."
            });
        } else {
            console.write(new String[] {
                "\nYour eye catches a glint of metal behind a rock.",
                "\nYou have found the magical Sword of Ogoroth!",
                "\nYou discard your silly old dagger and take the sword with you."
            });
            player.addItem("Sword of Ogoroth");
        }
        console.write("\nYou walk back out to the field.");
        this.backward(player);
    }
    
    @Override
    public String getTitle() {
        return "peer into the cave.";
    }
}
