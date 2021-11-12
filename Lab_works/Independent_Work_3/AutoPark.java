package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class AutoPark {
    ArrayList<Truck> autoParkTruck = new ArrayList<Truck>();
    ArrayList<Bus> autoParkBus = new ArrayList<Bus>();

    ArrayList<Auto> autoPark = new ArrayList<Auto>();

    private double minCost = 100000;
    private double maxSpeed;

    public void addTruck(String name, double weight, double speed, double rentTime, double fuelPrice, double liftingCapacity, double weightCargo)
    {
        autoParkTruck.add(new Truck(name,weight,speed,rentTime,fuelPrice,liftingCapacity,weightCargo));
    }
    public void addTruck(Truck truck)
    {
        autoParkTruck.add(truck);
    }
    public void addBus(String name, double weight, double speed, double rentTime, double fuelPrice,double numberOfSeats, double comfortFactor)
    {
        autoParkBus.add(new Bus(name,weight,speed,rentTime,fuelPrice,numberOfSeats,comfortFactor));
    }
    public void addBus(Bus bus)
    {
        autoParkBus.add(bus);
    }
    public void minCostTruck()
    {
        for(Truck aP:autoParkTruck)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getRentPrice() < minCost)
            {
                minCost = aP.getRentPrice();
            }
        }
        System.out.println("Грузовики с минимальной стоимостью аренды:\n");
        for(Truck aP:autoParkTruck)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getRentPrice() == minCost)
            {
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Грузоподъемность: " + aP.getLiftingCapacity() + ";");
            }
        }
        System.out.println("\n");
    }

    public void fastestBus()
    {
        for(Bus aP:autoParkBus)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getSpeed() > maxSpeed)
            {
                maxSpeed = aP.getSpeed();
            }
        }
        System.out.println("Самые быстрые автобусы:\n");
        for(Bus aP:autoParkBus)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getSpeed() == maxSpeed)
            {
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Количество сидячих мест: " + aP.getNumberOfSeats() + "; Коэффициент комфортабильности: "+aP.getComfortFactor()+ "; Скорость: "+ aP.getSpeed()+";");
            }
        }
        System.out.println("\n");
    }
    public void findCar(String name)
    {
        System.out.println("Информация о машинах модели " + name + ":\n");
        for(Truck aP:autoParkTruck)
        {
            if(aP.getName() == name)
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Грузоподъемность: " + aP.getLiftingCapacity() + ";");
        }
        for(Bus aP:autoParkBus)
        {
            if(aP.getName() == name)
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Количество сидячих мест: " + aP.getNumberOfSeats() + "Коэффициент комфортабильности: "+aP.getComfortFactor()+ ";");
        }
        System.out.println("\n");
    }
    public void mergerArray()
    {
        for(Truck aP:autoParkTruck)
        {
            //Collections.min(autoPark.getRentPrice());
            autoPark.add(aP);
        }
        for(Bus aP:autoParkBus)
        {
            //Collections.min(autoPark.getRentPrice());
            autoPark.add(aP);
        }
    }
    public void Info()
    {
        mergerArray();
        System.out.println("Список машин в автопарке: \n");
        for(Auto aP: autoPark)
        {
            System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + ";");
        }
        autoPark.clear();
    }
}
