package io.github.ioni5;

public class RunawayAction extends Action {

    public RunawayAction(Scenary scenary) {
        super(scenary);
    }

    @Override
    public void start(Player player) {
        console.write(new String[]{
            "\nYou run back into the field. Luckily, you don't seem ",
            "\nto have been followed."
        });
        scenary.backward(player);
    }

    @Override
    public String getTitle() {
        return "Runaway.";
    }
    
}
