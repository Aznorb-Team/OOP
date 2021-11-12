package com.company;

public class TV {
    public Boolean status;
    public String channel;

    public TV(Boolean status, String channel){
        this.status = status;
        setChannel(channel);
    }

    public void PowerOn(){
        if(status)
            System.out.println("Телевизор включен!");
        else
            status = true;
    }
    public void PowerOff(){
        if(!status)
            System.out.println("Телевизор выключен!");
        else
            status = false;
    }
    public Boolean getStatus(){
        return status;
    }
    public void setChannel(String channel){
        this.channel = channel;
    }
    public String getChannel(){
        return channel;
    }
    public void getInfo(){
        if(getStatus()){
            System.out.println("Телевизор включен; Канал: "+getChannel() + ";");
        }else{
            System.out.println("Телевизор выключен;");
        }
    }
}

