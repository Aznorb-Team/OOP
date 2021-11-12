package com.company;

public class Info implements Command{
    SantoroLimited sensor;
    public Info(SantoroLimited sensor){
        this.sensor = sensor;
    }
    @Override
    public void execute() {
        sensor.info();
    }
    public void unDo(){sensor.unDo();}

    public String getInfo() {
        return "Info";
    }
}
