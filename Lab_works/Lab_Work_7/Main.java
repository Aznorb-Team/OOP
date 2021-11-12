package com.company;

public class Main {

    public static void main(String[] args) {
	    AutoPark autoPark = new AutoPark();

	    autoPark.addAuto(1,"Газ-53", 20, 70, 5, 40, 5, 3.5);
        autoPark.addAuto(1,"Зил-131", 30, 90, 3, 50, 15, 10);
        autoPark.addAuto(1,"Зил-130", 28, 80, 4, 45, 13, 6);

        autoPark.addAuto(2,"ЛК-1", 30, 70, 8, 35, 15, 3.2);
        autoPark.addAuto(2,"Зис-127", 35, 75, 7, 37, 18, 2.8);
        autoPark.addAuto(2,"Раф-976", 28, 80, 6, 40, 16, 3.3);

        autoPark.minCostTruck();
        autoPark.fastestBus();
        autoPark.findCar("Зил-131");
        autoPark.Info();
    }
}
