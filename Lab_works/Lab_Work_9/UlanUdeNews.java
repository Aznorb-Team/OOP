package com.company;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.lang.String;
import java.nio.file.*;
import java.util.Date;

public class UlanUdeNews implements Observable{

    private List<Observer> infoSubjects;

    private List<String> news;

    private String newsChurch = "";
    private String typeNews = "";
    private String date = "";

    public UlanUdeNews() {
        infoSubjects = new ArrayList<Observer>();
    }
    public void setFileNews(String directory) throws IOException, InterruptedException, SQLException {

        FileInputStream fileInputStream = new FileInputStream(directory);
        int i,count = 0, flag = 0;


        while((i=fileInputStream.read())!= -1){
            if((char)i == ';')
            {
                count = count + 1;
                flag = 1;
            }

            if((char)i != ';' && flag == 0)
            {
                switch (count)
                {
                    case 0:
                        newsChurch += (char)i;
                        break;
                    case 1:
                        date += (char)i;
                        break;
                    case 2:
                        typeNews += (char)i;
                        break;
                }
            }
            if(count == 3){
                count = 0;
                //System.out.println(newsChurch + date + typeNews);

                setNewsChurch(newsChurch, date, typeNews);

                newsChurch = "";
                date = "";
                typeNews = "";
                TimeUnit.SECONDS.sleep(5);
            }
            flag = 0;
        }
    }

    public void setNewsChurch(String news, String date, String typeNews) {

        this.newsChurch = news;
        switch (typeNews)
        {
            case "1":
                this.typeNews = "информация о погоде";
                break;
            case "2":
                this.typeNews = "курс валют";
                break;
            case "3":
                this.typeNews = "новости города";
                break;
            default:
                this.typeNews = "неопознанный тип новости";
                break;
        }
        this.date = date;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        infoSubjects.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        infoSubjects.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : infoSubjects)
            o.update(newsChurch, date, typeNews);
    }
}
