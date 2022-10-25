package io.github.ioni5;

import java.util.Scanner;

public class Console {

    private Scanner sc = new Scanner(System.in);

    private int delay;

    public Console() {}

    public Console(int delay) {
        this.delay = delay;
    }

    public void write(String[] messages) {
        for (String message : messages) {
            this.write(message);
        }
    }

    public void write(String[] messages, String value) {
        for (String message : messages) {
            this.write(String.format(message, value));
        }
    }

    public void write(String message) {
        if (delay > 0) {
            this.writeWithDelay(message);
        } else {
            System.out.print(message);
        }
    }

    private void writeWithDelay(String message) {
        try {
            for (char c : message.toCharArray()) {
                System.out.print(c);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }

    public int readInt(String message) {
        int input = 0;
        try {
            input = Integer.parseInt(this.read(message));
        } catch (Exception ex) {
            this.write("\nError: invalid input.");
            System.exit(0);
        }
        return input;
    }

    private String read(String message) {
        String input = null;
        this.write(message);
        try {
            input = sc.nextLine();
        } catch (Exception ex) {
            this.write("\nError: invalid input.");
            System.exit(0);
        }
        return input;
    }
    
}
