package io.github.ioni5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Option> options = new ArrayList<>();

    private Console console = new Console();

    public void add(Option option) {
        options.add(option);
    }

    public void show() {
        for (int i = 0; i < options.size(); i++) {
            console.write("\n[" + (i + 1) + "]" + options.get(i).getTitle());
        }
    }

    public Option getOption() {
        int option = console.readInt("\nEnter option (1-" + options.size() + "): ");
        return options.get(option - 1);
    }

}
