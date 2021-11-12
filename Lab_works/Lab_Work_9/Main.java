package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, SQLException {
        UlanUdeNews uuNews = new UlanUdeNews();

        DataBaseManager.DataBaseManager("DataBase");
        DataBaseManager.CreateDB();

        NewsPaperInformPolicy paper = new NewsPaperInformPolicy("Новостная газета Информ Полис");
        TVChannelArigUs tv = new TVChannelArigUs("Телеканал Ариг Ус");
        DataBaseObserver dataBase = new DataBaseObserver("База данных");

        uuNews.registerObserver(paper);
        uuNews.registerObserver(tv);
        uuNews.registerObserver(dataBase);

        uuNews.setFileNews("news.txt");

        DataBaseManager.ReadDB();
        DataBaseManager.CloseDB();
    }
}
