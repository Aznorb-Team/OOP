package com.company;
import java.io.*;
import java.lang.String;
import java.nio.file.Path;

public class FileManager{
    private String directory;
    private String name;
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
            String proverkaline = proverkaReader.readLine();
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
                if(bool == 0) {
                    this.directory = line;
                    line = reader.readLine();
                }

                this.name = line;
                line = reader.readLine();

                this.a = Integer.parseInt(line.trim());
                line = reader.readLine();
                this.b = Integer.parseInt(line.trim());
                line = reader.readLine();
            }
            fr.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        if(bool == 1)
        {
            file = new File(this.name);
            existenceDirectory = -1;
        }else
        {
            file = new File(this.directory);
            if(!file.mkdir())
            {
                //System.out.println("Folder created");
                file.mkdirs();

                file = new File(this.directory, this.name);
                existenceDirectory = 1;
            }else
            {
                //file = new File(this.directory,this.name);
                existenceDirectory = 0;
            }
        }

        if(bool == 1)
        {
            file = new File(this.name);
        }else
        {
                file = new File(this.directory, this.name);
        }

        CreateFile();
    }
    /*
    public FileManager(String name, double a, double b){
        this.name = name;
        this.a = a;
        this.b = b;
        existenceDirectory = -1;
        file = new File(this.name);
        CreateFile();
    }
    */

    public void CreateFile()
    {
        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
                existenceFile = 0;
            }else {
                existenceFile = 1;
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                String dir = "Directory name: " + getPathFile() + "\n";
                String nam = "File name: " + getNameFile()+ "\n";
                String dirAdd = "Directory: " + getExistsDirectory()+ "\n";
                String fil = "File: " + getExistsFile()+ "\n";
                double r = 0.5 * a * b;
                String res = "Result: " + r+ "\n";
                out.print(dir);
                out.print(nam);
                out.print(dirAdd);
                out.print(fil);
                out.print(res);
                //Записываем текст у файл
                //out.print(0.5 * a * b);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ReadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ReadFile() throws IOException
    {
        FileReader reader = new FileReader(file);
        BufferedReader readerBuf = new BufferedReader(reader);

        String dir = "Directory name: " + getPathFile();
        String nam = "File name: " + getNameFile();
        String dirAdd = "Directory: " + getExistsDirectory();
        String fil = "File: " + getExistsFile();
        double r = 0.5 * a * b;
        String res = "Result: " + r;

        String result = readerBuf.readLine();

        System.out.println("Directory name: " + getPathFile());
        System.out.println("File name: " + getNameFile());
        System.out.println("Directory: " + getExistsDirectory());
        System.out.println("File: " + getExistsFile());
        System.out.println("Result: " + res);

        reader.close();
    }
    public String getPathFile()
    {
        return file.getPath();
    }
    public String getNameFile()
    {
        return file.getName();
    }
    public String getExistsFile()
    {
        if(existenceFile == 1)
            return "exists";
        else
            return "created";
    }
    public String getExistsDirectory()
    {

        switch (existenceDirectory)
        {
            case (1):
                resultStr = "exists";
                break;
            case 0:
                resultStr = "created";
                break;
            case -1:
                resultStr = "No set!";
                break;
        }
        return resultStr;
    }
}