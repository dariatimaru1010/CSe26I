/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pgn
 */
public class CarDealerShip
{

    private List<Car> carsForSale = new ArrayList<>();

    /**
     * Adds another car for sale but only if the value is not null, and only if
     * the car has a price greater than zero.
     *
     * @param car The car to add to list of cars for sale.
     */
    public void addCarForSale(Car car)
    {
        if(car!=null && car.getPrice()>0)
            this.carsForSale.add(car);
    }
    
    /**
     * Gets the total value of all cars for sale.
     * @return the total value of all cars for sale.
     */
    public double getTotalCarValues()
    {
        double value = 0;
        for(Car c: carsForSale)
            value += c.getPrice();
        return value;

        /*return carsForSale.stream()
                .mapToDouble(Car::getPrice)
                .sum();*/
    }
    
    /**
     * Gets the cheapest car from the list ov cars for sale.
     * @return the cheapest car from the list of cars for sale.
     */
    public Car getCheapestCar()
    {
        Car cheapest=null;
        for(Car c: carsForSale){
            if(cheapest==null || cheapest.getPrice()>c.getPrice())
                cheapest=c;
        }
        return cheapest;


        /*return carsForSale.stream().reduce((car, car2) -> {
            if(car.getPrice()<car2.getPrice())
                return car;
            return car2;
        }).orElse(null);*/


        /*return carsForSale.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);*/

    }
    
    /**
     * Sells the car in the parameter.
     * @param car The car to be sold.
     */
    public void sellCar(Car car)
    {
        carsForSale.remove(car);
    }

    /**
     * Nothing to do here
     * @return 
     */
    public List<Car> getCarsForSale()
    {
        return carsForSale;
    }
        
    /**
    * Sort the list of cars for sale in order from cheapest to most expensive
    */    
    public void sortCarsByPrice()
    {
        carsForSale.sort(
                (car1, car2) ->
                        (int)(car1.getPrice()-car2.getPrice())
        );

        List<Car> sortedCars = new ArrayList<>();

        while(!carsForSale.isEmpty()){
            Car cheapest = getCheapestCar();
            sortedCars.add(cheapest);
            carsForSale.remove(cheapest);
        }
        carsForSale = sortedCars;

        int n = carsForSale.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Car a = carsForSale.get(j);
                Car b = carsForSale.get(j + 1);
                if (a.getPrice() > b.getPrice()) {
                    carsForSale.set(j, b);
                    carsForSale.set(j + 1, a);
                    swapped = true;
                }
            }
            if (!swapped) break;   // already sorted, stop early
        }
    }
    
    /**
    * Sort the list of cars for sale in order from slowest to fastest.
    */    
    public void sortCarsByMaxSpeed()
    {
        //carsForSale.sort((o1, o2) -> (int)(o1.getMaxKilometersPerHour()-o2.getMaxKilometersPerHour()));

        carsForSale.sort(Comparator.comparing(Car::getMaxKilometersPerHour));
    }
    
    /**
     * Get a random car for sale.
     * @return a randomly selected car for sale.
     */
    public Car presentRandomCarToCustomer()
    {
        Random r = new Random(928375982);
        return carsForSale.get(r.nextInt(carsForSale.size()));

        //return carsForSale.get((int)(Math.random()*carsForSale.size()));
    }

}