package io.github.ioni5;

public abstract class Action implements Option {

    protected Console console = new Console(Game.DELAY);

    protected Scenary scenary;

    public Action(Scenary scenary) {
        this.scenary = scenary;
    }

    public abstract void start(Player player);

}
