package com.company;

public abstract class Auto {
    protected String name;//Модель машины
    protected double weight;//Вес машины
    protected double speed;//Скорость машины в час
    protected double rentTime;//На сколько часов арендуют
    protected double fuelPrice;//Цена топлива за литр

    //Конструктор
    public Auto(String name, double weight, double speed, double rentTime, double fuelPrice){
        setName(name);
        setWeight(weight);
        setSpeed(speed);
        setRentTime(rentTime);
        setFuelPrice(fuelPrice);
    }

    public Auto() {

    }

    //Задать значение имени
    protected void setName(String name)
    {
        this.name = name;
    }
    //Задать значение весу
    protected void setWeight(double weight)
    {
        if(weight > 0)
            this.weight = weight;
        else
            System.out.println("Неверно задан вес!");
    }
    //Задать значение скорости
    protected void setSpeed(double speed)
    {
        if(speed > 0)
            this.speed = speed;
        else
            System.out.println("Неверно задана скорость!");
    }
    protected void setRentTime(double rentTime)
    {
        if(rentTime > 0)
            this.rentTime = rentTime;
        else
            System.out.println("Неверно задано время аренды!");
    }
    protected void setFuelPrice(double fuelPrice)
    {
        if(fuelPrice > 0)
            this.fuelPrice = fuelPrice;
        else
            System.out.println("Неверно задана цена за литр топлива!");
    }

    //Получить стоимость аренды в час
    public abstract double getRentPrice();
    //Получить стоимость затрат топлива в час
    public abstract double getFuelCostsPrice();
    //Получить общую сумму аренды
    public abstract double getTotalCosts();

    //Получить название модели машины
    public String getName() {return name;}
    //Получить вес машины
    public double getWeight() {return weight;}
    //Получить скорость машины
    public double getSpeed() {return speed;}
}
