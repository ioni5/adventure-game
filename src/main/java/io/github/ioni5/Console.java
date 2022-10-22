package io.github.ioni5;

import java.util.Scanner;

public class Console {

    private Scanner sc = new Scanner(System.in);

    public void write(String message) {
        System.out.print(message);
    }

    public void write(int message) {
        System.out.print(message);
    }

    public void writeWithDelay(String message) {
        this.write(message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }

    public int readInt(String message) {
        int input = 0;
        this.write(message);
        try {
            input = sc.nextInt();
        } catch (Exception ex) {
            this.write("\nError: invalid input.");
            System.exit(0);
        }
        return input;
    }
    
}
