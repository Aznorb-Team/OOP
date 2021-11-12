package com.company;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.lang.*;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        AutoPark autoPark = new AutoPark();
        Scanner in = new Scanner(System.in);
        int toContinue = 1;

        String typeAuto;
        String nameModel;
        double weight;
        double speed;
        double rentTime;
        double fuelPrice;
        double dop1;
        double dop2;

        //autoPark.addTruck("Газ-53", 20, 70, 5, 40, 5, 3.5);
        //autoPark.addTruck("Зил-131", 30, 90, 3, 50, 15, 10);
        //autoPark.addTruck("Зил-130", 28, 80, 4, 45, 13, 6);

        //autoPark.addBus("ЛК-1", 30, 70, 8, 35, 15, 3.2);
        //autoPark.addBus("Зис-127", 35, 75, 7, 37, 18, 2.8);
        //autoPark.addBus("Раф-976", 28, 80, 6, 40, 16, 3.3);

        while(toContinue != 0)
        {
            //System.out.println("Введите вид машины: ");
            typeAuto = in.nextLine();
            /*while((typeAuto != "Truck") || (typeAuto != "Bus"))
            {
                //System.out.println("Вы ввели неизвестное значение, пожалуйства введите корректные данные!");
                typeAuto = in.nextLine();
            }
            //System.out.println("Введите модель машины: ");
            nameModel = in.nextLine();
            System.out.println("Введите вес машины: ");
            weight = in.nextDouble();
            System.out.println("Введите скорость машины: ");
            speed = in.nextDouble();
            System.out.println("Введите время аренды машины: ");
            rentTime = in.nextDouble();
            System.out.println("Введите стоимость бензина машины: ");
            fuelPrice = in.nextDouble();

            switch(typeAuto)
            {
                case "Truck":
                    System.out.println("Введите грузоподъёмность машины: ");
                    dop1 = in.nextDouble();
                    System.out.println("Введите вес перевозимого груза машины: ");
                    dop2 = in.nextDouble();
                    autoPark.addTruck(nameModel, weight, speed, rentTime, fuelPrice, dop1, dop2);
                    break;
                case "Bus":
                    System.out.println("Введите кколичество сидячих мест машины: ");
                    dop1 = in.nextDouble();
                    System.out.println("Введите коэффициент комфортабельности машины: ");
                    dop2 = in.nextDouble();
                    autoPark.addBus(nameModel, weight, speed, rentTime, fuelPrice, dop1, dop2);
                    break;
            };
            System.out.println("Продолжить добавление?(1 - продолжить, 0 - закончить)");
            toContinue = in.nextInt();
            /*while(toContinue != "Next" || toContinue != "End")
            {
                System.out.println("Вы ввели неизвестное значение, пожалуйства введите корректные данные!");
                toContinue = in.nextLine();
            }
        }

        autoPark.minCostTruck();
        autoPark.fastestBus();
        autoPark.findCar("Зил-131");
        autoPark.Info();
        */

        /*
        //Тренинг
        Class mClassObject;
        //Ищем класс с именем AutoPark
        mClassObject = AutoPark.class;
        //Получаем имя класса
        String fullClassName = mClassObject.getSimpleName();
        //Доступ к модификатору доступа
        int classModifiers = mClassObject.getModifiers();
        //Получаение информации о пакете
        Package packageClass = mClassObject.getPackage();
        //Получаем поля класса
        Field[] fields = mClassObject.getDeclaredFields();
        for(int i=0; i<fields.length; i++)
            System.out.println(fields[i].getName());
        System.out.println(fullClassName);
        System.out.println(packageClass);
        */
        // Работа
        //Создание класса Автопарк
        AutoPark autoPark = null;
        try {
            Class clazz = Class.forName(AutoPark.class.getName());
            autoPark = (AutoPark) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //System.out.println(autoPark);//output created object reflection.MyClass@60e53b93
        autoPark.addTruck("Газ-53", 20, 70, 5, 40, 5, 3.5);
        System.out.println();
        autoPark.Info();

        //Создание класса грузовик
        Truck truck = null;
        try {
            Class clazz = Class.forName(Truck.class.getName());
            Class[] params = {String.class, double.class, double.class, double.class,double.class,double.class,double.class};
            //System.out.println(Arrays.toString(clazz.getConstructors()));
            truck = (Truck) clazz.getConstructor(params).newInstance("Зил-131", 30, 90, 3, 50, 15, 10);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        //System.out.println(truck.getLiftingCapacity());
        autoPark.addTruck(truck);
        System.out.println();
        autoPark.Info();

        //Создание класса автобус
        Bus bus = null;
        try {
            Class clazz = Class.forName(Bus.class.getName());
            Class[] params = {String.class, double.class, double.class, double.class,double.class,double.class,double.class};
            //System.out.println(Arrays.toString(clazz.getConstructors()));
            bus = (Bus) clazz.getConstructor(params).newInstance("ЛК-1", 30, 70, 8, 35, 15, 3.2);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        //System.out.println(bus.getComfortFactor());
        autoPark.addBus(bus);
        System.out.println();
        autoPark.Info();
    }
}
/*
Reflection API
 */
