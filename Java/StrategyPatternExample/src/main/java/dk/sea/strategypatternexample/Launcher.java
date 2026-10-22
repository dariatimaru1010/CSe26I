package dk.sea.strategypatternexample;

import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);

        Car v = new Car("Chevy van", 3456, "SKDMKJSDFNKJSEE");
    }
}
