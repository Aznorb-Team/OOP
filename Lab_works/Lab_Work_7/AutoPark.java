package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class AutoPark {
    ArrayList<Auto> autoPark = new ArrayList<Auto>();

    private double minCost = 100000;
    private double maxSpeed;

    public void addAuto(int typeAuto,String name, double weight, double speed, double rentTime, double fuelPrice, double liftingCapacity, double weightCargo)
    {
        switch(typeAuto)
        {
            case 1:
                autoPark.add(new Truck(name,weight,speed,rentTime,fuelPrice,liftingCapacity,weightCargo));
                break;
            case 2:
                autoPark.add(new Bus(name,weight,speed,rentTime,fuelPrice,(int)liftingCapacity,weightCargo));
                break;
        }
    }
    public void minCostTruck()
    {
        for(Auto aP:autoPark)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getRentPrice() < minCost && aP.typeAuto == 1)
            {
                minCost = aP.getRentPrice();
            }
        }
        System.out.println("Грузовики с минимальной стоимостью аренды:\n");
        for(Auto aP:autoPark)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getRentPrice() == minCost && aP.typeAuto == 1)
            {
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Грузоподъемность: " + aP.getLiftingCapacity() + ";");
            }
        }
        System.out.println("\n");
    }

    public void fastestBus()
    {
        for(Auto aP:autoPark)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getSpeed() > maxSpeed && aP.typeAuto == 2)
            {
                maxSpeed = aP.getSpeed();
            }
        }
        System.out.println("Самые быстрые автобусы:\n");
        for(Auto aP:autoPark)
        {
            //Collections.min(autoPark.getRentPrice());
            if(aP.getSpeed() == maxSpeed && aP.typeAuto == 2)
            {
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Количество сидячих мест: " + aP.getNumberOfSeats() + "; Коэффициент комфортабильности: "+aP.getComfortFactor()+ "; Скорость: "+ aP.getSpeed()+";");
            }
        }
        System.out.println("\n");
    }
    public void findCar(String name)
    {
        System.out.println("Информация о машинах модели " + name + ":\n");
        for(Auto aP:autoPark)
        {
            if(aP.getName() == name && aP.typeAuto == 1)
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Грузоподъемность: " + aP.getLiftingCapacity() + ";");
        }
        for(Auto aP:autoPark)
        {
            if(aP.getName() == name && aP.typeAuto == 2)
                System.out.println("Модель: " + aP.getName() + "; Стоимость аренды в час: " + aP.getRentPrice() + "; Количество сидячих мест: " + aP.getNumberOfSeats() + "Коэффициент комфортабильности: "+aP.getComfortFactor()+ ";");
        }
        System.out.println("\n");
    }
    public void mergerArray()
    {
        for(Auto aP:autoPark)
        {
            if(aP.typeAuto == 1)
            //Collections.min(autoPark.getRentPrice());
                autoPark.add(aP);
        }
        for(Auto aP:autoPark)
        {
            if(aP.typeAuto == 2)
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
    }
}
