package io.github.ioni5;

/**
 * Hello world!
 *
 */
public class App {

    public void start() {
        Console console = new Console();
        console.write("\n-Adventure Game-\n");
        do {
            new Game().start();
        } while(this.again());
        console.write("\nGoodbye\n");
    }

    private boolean again() {
        Console console = new Console();
        boolean error = false;
        String input = console.read("\nWould you like to play again? (y/n): ");
        do {
            error = !input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n");
            if (error) {
                input = console.read("\nPlease enter (y/n): ");
            }
        } while (error);
        return input.equalsIgnoreCase("y");
    }

    public static void main( String[] args ) {
        new App().start();
    }
}