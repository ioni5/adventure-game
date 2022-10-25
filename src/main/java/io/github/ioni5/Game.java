package io.github.ioni5;

public class Game {

    public static final int DELAY = 10;

    private Player player;

    private Scenary root;

    public Game() {
        player = new Player();
        root = new Lobby();
        root.add(new House());
        root.add(new Cave());
    }
    
    public void start() {
        Console console = new Console();
        console.write("\nAdventure Game\n");
        root.start(player);
        console.write("\nGameOver\n");
    }
}
