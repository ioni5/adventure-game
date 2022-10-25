package io.github.ioni5;

public abstract class Action implements Option {

    protected Console console = new Console(Game.DELAY);

    public abstract void start(Scenary scenary, Player player);

}
