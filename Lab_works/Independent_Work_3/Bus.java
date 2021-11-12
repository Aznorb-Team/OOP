package com.company;

public class Bus extends Auto{
    private double numberOfSeats;//Количество сидячих мест
    private double comfortFactor;//Коэффициент комфортабельности

    public Bus(String name, double weight, double speed, double rentTime, double fuelPrice,double numberOfSeats, double comfortFactor) {
        super(name, weight, speed, rentTime, fuelPrice);
        brandReassignment(numberOfSeats, comfortFactor);
    }

    public void setNumberOfSeats(double numberOfSeats)
    {
        if(numberOfSeats > 0)
            this.numberOfSeats = numberOfSeats;
        else
            System.out.println("Неверно задано количество сидячих мест!");
    }
    public void setComfortFactor(double comfortFactor)
    {
        if(comfortFactor > 0)
            this.comfortFactor = comfortFactor;
        else
            System.out.println("Неверно задан коэффициент комфортабельности!");
    }
    public double getNumberOfSeats()
    {
        return numberOfSeats;
    }
    public double getComfortFactor()
    {
        return comfortFactor;
    }

    //Переназначение марки
    public void brandReassignment(double numberOfSeats, double comfortFactor)
    {
        setNumberOfSeats(numberOfSeats);
        setComfortFactor(comfortFactor);
    }

    @Override
    public double getRentPrice() {
        return numberOfSeats * comfortFactor * 15;
    }

    @Override
    public double getFuelCostsPrice() {
        return 10 * (rentTime/speed);
    }

    @Override
    public double getTotalCosts() {
        return getRentPrice() * rentTime + getFuelCostsPrice() * rentTime * fuelPrice;
    }
}
