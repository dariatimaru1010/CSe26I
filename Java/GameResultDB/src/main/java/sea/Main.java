package sea;

import javafx.application.Application;
import sea.be.GameResult;
import sea.dal.ResultDAO;
import sea.gui.ConsoleGUI;
import sea.gui.GameResultFX;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //new ConsoleGUI().start();
        Application.launch(GameResultFX.class);
    }


}
