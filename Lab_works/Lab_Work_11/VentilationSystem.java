package com.company;

public class VentilationSystem extends NickyAndSons implements Command{
    public void info(){
        System.out.println("Система вентиляции!");
    }
    public void execute(){
        info();
    }
    public void unDo(){System.out.println("Обратное действие системы вентиляции!");};

    public String getInfo() {
        return "VentilationSystem";
    }
}
