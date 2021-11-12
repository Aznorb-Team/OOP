package com.company;

public class Main {

    public static void main(String[] args) {
        GreenCorporations airHumiditySensor= new AirHumiditySensor();
        GreenCorporations soilSensor= new SoilSensor();
        GreenCorporations temperatureSensor = new TemperatureSensor();
        SantoroLimited irrigationSystem= new IrrigationSystem();
        NickyAndSons ventilation= new VentilationSystem();

        Command estimateAir = new Estimate(airHumiditySensor);

        RemoteController remote = new RemoteController();
        remote.AddButton(estimateAir);

        Command estimateSoil = new Estimate(soilSensor);
        remote.AddButton(estimateSoil);

        Command estimateTemperature = new Estimate(temperatureSensor);
        remote.AddButton(estimateTemperature);

        Command irrigationSystemInfo = new Info(irrigationSystem);
        remote.AddButton(irrigationSystemInfo);

        Command ventilationInfo = (Command)ventilation;
        remote.AddButton(ventilationInfo);


        remote.ClickButton(1);
        remote.ClickButton(0);
        remote.ClickButton(2);
        remote.ClickButton(0);
        remote.ClickButton(3);
        remote.ClickButton(0);
        remote.ClickButton(4);
        remote.ClickButton(0);
        remote.ClickButton(5);
        remote.ClickButton(0);
    }
}
