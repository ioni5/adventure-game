package io.github.ioni5;

public class Game {

    public static final int DELAY = 10;

    public static final String[] ENEMIES = { "wicked fairie", "troll", "dragon", "gorgon", "pirate" };

    private Player player;

    private Scenary root;

    public Game() {
        player = new Player();
        root = new Lobby();
        root.add(new House());
        root.add(new Cave());
    }
    
    public void start() {
        root.start(player);
        new Console().write("\nGame Over\n");
    }
}
