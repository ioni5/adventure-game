package io.github.ioni5;

import java.util.ArrayList;
import java.util.List;

public abstract class Scenary implements Option {

    private List<Action> actions;

    private List<Scenary> childs;

    private Scenary parent;

    protected Console console = new Console(Game.DELAY);

    public Scenary() {
        parent = null;
        childs = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public void add(Scenary scenary) {
        childs.add(scenary);
        scenary.parent = this;
    }

    public void add(Action action) {
        actions.add(action);
    }

    private Scenary next() {
        Menu menu = new Menu();
        for (Scenary scenary : childs) {
            menu.add(scenary);
        }
        menu.show();
        return (Scenary)menu.getOption();
    }

    public Action actionSelector() {
        Menu menu = new Menu();
        for (Action action : actions) {
            menu.add(action);
        }
        menu.show();
        return (Action)menu.getOption();
    }

    protected void forward(Player player) {
        Scenary next = this.next();
        next.start(player);
    }

    protected void backward(Player player) {
        Scenary next = parent.next();
        next.start(player);
    }

    protected abstract void start(Player player);
    
}
