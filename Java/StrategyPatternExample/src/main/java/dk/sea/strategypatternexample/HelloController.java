package dk.sea.strategypatternexample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public ToggleGroup grpSorting;
    public RadioButton radioName;
    public RadioButton radioPrice;
    @FXML
    private ListView<Car> listCars;
    private List<Car> cars = new ArrayList();

    private List<Comparator<Car>> carStrategies = new ArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cars.add(new Car("Chevy Van 1999", 4500,""));
        cars.add(new Car("Ferrari F50", 15400,""));
        cars.add(new Car("Chevrolet Corvette C6", 300,""));
        cars.add(new Car("Fiat Multipla 2004", 6700,""));

        listCars.getItems().addAll(cars);

    }

    @FXML
    protected void onHelloButtonClick() {
        CarPriceCompareStrategy priceComp = new CarPriceCompareStrategy();
        CarNameSortingStrategy nameComp = new CarNameSortingStrategy();

        if (grpSorting.getSelectedToggle() == radioName){
            listCars.getItems().sort(nameComp);
        }
        if (grpSorting.getSelectedToggle() == radioPrice){
            listCars.getItems().sort(priceComp);
        }

    }


}
