package com.company;

public class Estimate implements Command{
    GreenCorporations sensor;
    public Estimate(GreenCorporations sensor){
        this.sensor = sensor;
    }
    @Override
    public void execute() {
        sensor.estimate();
    }
    public void unDo(){sensor.unDo();}
    public String getInfo() {
        return "Estimate";
    }
}
