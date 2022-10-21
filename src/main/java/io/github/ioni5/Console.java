package io.github.ioni5;

public class Console {

    public void write(String message) {
        System.out.print("\n" + message);
    }

    public void writeWithDelay(String message) {
        this.write(message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }
    
}
