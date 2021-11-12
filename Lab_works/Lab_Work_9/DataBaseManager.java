package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void DataBaseManager(String nameDB) throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        String info = "jdbc:sqlite:"+nameDB+".s3db";
        conn = DriverManager.getConnection(info);

        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
    public static void CreateDB() throws ClassNotFoundException, SQLException
    {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'classes' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'textNews' text, 'date' text, 'typeNews' text, 'systemDate' text);");

        System.out.println("Таблица создана или уже существует.");
    }

    // --------Заполнение таблицы--------
    public static void WriteDB(String text, String date, String type, String systemDate) throws SQLException
    {
        String info = "INSERT INTO 'classes' ('textNews', 'date', 'typeNews', 'systemDate') VALUES ('" + text + "', '" + date + "', '" + type + "', '" + systemDate + "'); ";
        statmt.execute(info);
        //String info = "INSERT INTO 'classes' ('name', 'result') VALUES ('" + nameClass + "', " + result + "); ";
        //statmt.execute("INSERT INTO 'classes' ('name', 'result') VALUES ('nameClass',result); ");

        System.out.println("Таблица заполнена");
    }
    // --------Удаление данных из таблицы--------
    public static void DeleteDB(int deleteString) throws SQLException
    {
        String info = "DELETE FROM classes WHERE id = "+deleteString;
        statmt.execute(info);
        //String info = "INSERT INTO 'classes' ('name', 'result') VALUES ('" + nameClass + "', " + result + "); ";
        //statmt.execute("INSERT INTO 'classes' ('name', 'result') VALUES ('nameClass',result); ");

        System.out.println("Таблица заполнена");
    }

    // -------- Вывод таблицы--------
    public static void ReadDB() throws ClassNotFoundException, SQLException
    {
        resSet = statmt.executeQuery("SELECT * FROM classes");

        while(resSet.next())
        {
            int id = resSet.getInt("id");
            String  text = resSet.getString("textNews");
            String  date = resSet.getString("date");
            String  type = resSet.getString("typeNews");
            String  systemDate = resSet.getString("systemDate");
            System.out.println( "ID = " + id );
            System.out.println( "textNews = " + text );
            System.out.println( "date = " + date );
            System.out.println( "typeNews = " + type );
            System.out.println( "systemDate = " + systemDate );
            System.out.println();
        }

        System.out.println("Таблица выведена");
    }

    // --------Закрытие--------
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }
}
