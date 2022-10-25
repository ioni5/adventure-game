package io.github.ioni5;

public class RunawayAction extends Action {

    @Override
    public void start(Scenary scenary, Player player) {
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
