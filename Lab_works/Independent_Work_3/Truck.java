package com.company;

public class Truck extends Auto{

    public double liftingCapacity;//Грузоподъёмность
    private double weightCargo;//Вес груза

    public Truck()
    {
        super();

    }
    public Truck(String name, double weight, double speed, double rentTime, double fuelPrice, double liftingCapacity, double weightCargo) {
        super(name, weight, speed, rentTime, fuelPrice);
        setLiftingCapacity(liftingCapacity);
        setWeightCargo(weightCargo);
    }

    public void setLiftingCapacity(double liftingCapacity)
    {
        if(liftingCapacity > 0)
            this.liftingCapacity = liftingCapacity;
        else
            System.out.println("Неверно задана грузоподъемность!");
    }
    public void setWeightCargo(double weightCargo)
    {
        if(weightCargo > 0)
            this.weightCargo = weightCargo;
        else
            System.out.println("Неверно задан вес груза!");
    }

    public double getLiftingCapacity()
    {
        return liftingCapacity;
    }

    @Override
    public double getRentPrice() {
        return 10 * liftingCapacity;
    }

    @Override
    public double getFuelCostsPrice() {
        return 10 * 10 * weightCargo;
    }

    @Override
    public double getTotalCosts() {
        return getRentPrice()*rentTime+getFuelCostsPrice()*fuelPrice;
    }
}
