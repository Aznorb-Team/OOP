package com.company;
import java.util.Date;

public class NewsPaperInformPolicy implements Observer {
    private String name;

    public NewsPaperInformPolicy(String name) {
        this.name = name;
    }
    @Override
    public void update(String news, String date, String typeNews) {

        System.out.println(name + " получил информацию: " + news + "; " + date + "; " + typeNews + ';');
        System.out.println();
    }
}
