package com.company;

public class TVJson implements JSONImportable{
    public TV tv;
    public TVJson(TV tv){
        this.tv = tv;
    }
    public String getJson(){
        return "{"+ "\n"+"\t"+ "\""+"status"+"\""+": "+"\""+tv.getStatus()+"\""+","+"\n"+"\t"+ "\""+"channel"+"\""+ ": "+"\""+tv.getChannel()+"\""+"\n"+"}"+ "\n";
    }
}
