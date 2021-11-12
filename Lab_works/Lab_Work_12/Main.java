package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Cat c = new Cat("Василий", 2);

        JsonCollector collector = new JsonCollector();
        //collector.getInfo(c);

        TV tv = new TV(true, "ArigUs");
        TVJson tvJson = new TVJson(tv);
        collector.getInfo(tvJson);
    }
}
