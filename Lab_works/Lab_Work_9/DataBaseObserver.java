package com.company;

import java.sql.SQLException;
import java.util.Date;

public class DataBaseObserver implements Observer{
    private String name;
    public Date date;

    public DataBaseObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String news, String date, String typeNews) {
        //date = new Date();
        System.out.println(name + " получил информацию: " + news + "; " + date + "; " + typeNews + ';');
        System.out.println();
        try {
            DataBaseManager.WriteDB(news, date, typeNews, String.valueOf(new Date()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
