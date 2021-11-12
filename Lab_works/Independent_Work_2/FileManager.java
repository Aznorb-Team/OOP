package com.company;
import java.io.*;
import java.lang.String;
import java.nio.file.Path;
import java.io.ObjectOutputStream;

public class FileManager{
    private String name;
    private String doMethod;
    private double a;
    private double b;
    private int existenceFile;
    private int existenceDirectory;
    String resultStr;
    int bool;

    File file;

    public FileManager(String directory){

        try(FileReader proverkaF = new FileReader(directory))
        {
            BufferedReader proverkaReader = new BufferedReader(proverkaF);
            String proverkaline;
            proverkaline = proverkaReader.readLine();

            if(proverkaline.matches("[-+]?\\d+"))
                bool = 1;
            else
                bool = 0;

            proverkaF.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader fr = new FileReader(directory))
        {
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                this.name = line;
                line = reader.readLine();
                this.doMethod = line;
                line = reader.readLine();
                if(this.doMethod.equals("serialize")) {
                    this.a = Integer.parseInt(line.trim());
                    line = reader.readLine();
                    this.b = Integer.parseInt(line.trim());
                    line = reader.readLine();
                    CreateFile();
                } else if (this.doMethod.equals("unserialize")) {
                    ReadFile();
                }
            }
            fr.close();
        }
        catch(IOException | ClassNotFoundException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void CreateFile() {
            try {
                Vector vector = new Vector(a, b);
                //создаем 2 потока для сериализации объекта и сохранения его в файл
                FileOutputStream outputStream = new FileOutputStream(name);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                // сохраняем игру в файл
                objectOutputStream.writeObject(vector);

                //закрываем поток и освобождаем ресурсы
                objectOutputStream.close();

                System.out.println("Сериализация произошла успешно!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        /*
        try {
            ReadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

    }
    public Vector ReadFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(name);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Vector vector = (Vector) objectInputStream.readObject();

        System.out.println("Десериализация произошла успешно!");

        System.out.println(vector.info());
        System.out.println(vector.a);
        System.out.println(vector.b);

        return vector;
    }

}