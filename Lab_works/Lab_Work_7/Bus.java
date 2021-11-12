package com.company;

public class Bus extends Auto{
    public int typeAuto = 2;
    private int numberOfSeats;//Количество сидячих мест
    private double comfortFactor;//Коэффициент комфортабельности

    public Bus(String name, double weight, double speed, double rentTime, double fuelPrice,int numberOfSeats, double comfortFactor) {
        super(name, weight, speed, rentTime, fuelPrice);
        brandReassignment(numberOfSeats, comfortFactor);
    }

    public void setNumberOfSeats(int numberOfSeats)
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
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }
    public double getComfortFactor()
    {
        return comfortFactor;
    }

    //Переназначение марки
    public void brandReassignment(int numberOfSeats, double comfortFactor)
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
