/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author pgn
 */
public class Car
{
    private double price = 55000;
    private int maxKilometersPerHour = 10;
    private String manufacturer = "Renault";

    /**
     *
     * @return The value of the maxKilometersPerHour instance variable
     */
    public int getMaxKilometersPerHour()
    {
        return this.maxKilometersPerHour;
    }

    /**
     * Sets the maxKilometersPerHour instance variable, but only the parameter
     * is a positive number greater than zero and not greater than 300 km/h!
     *
     * @param maxKilometersPerHour
     */
    public void setMaxKilometersPerHour(int maxKilometersPerHour)
    {
        if(maxKilometersPerHour>0 && maxKilometersPerHour<=300)
            this.maxKilometersPerHour = maxKilometersPerHour;
    }

    /**
     *
     * @return the value of the manufacturer instance variable
     */
    public String getManufacturer()
    {
        return manufacturer;
    }

    /**
     * Sets the manufactor instance variable but only if the parameter is not
     * null or empty.
     *
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer)
    {
        if(manufacturer != null && !manufacturer.isEmpty())
            this.manufacturer = manufacturer;
    }

    /**
     *
     * @return the value of the price instance variable.
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
     * Sets the value of the price instance variable but only if it is positive
     * and greater than zero
     *
     * @param price
     */
    public void setPrice(double price)
    {
        if(price>0)
            this.price = price;
    }

}
