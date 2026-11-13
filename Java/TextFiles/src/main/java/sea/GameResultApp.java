package sea;

import javafx.application.Application;
import sea.gui.ConsoleGUI;
import sea.gui.JavaFXGUI;

public class GameResultApp {
    public static void main(String[] args) {
        /*ConsoleGUI cgui = new ConsoleGUI();
        cgui.startGUI();*/

        Application.launch(JavaFXGUI.class);
    }
}