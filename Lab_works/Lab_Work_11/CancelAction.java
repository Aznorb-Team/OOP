package com.company;

public class CancelAction implements Command{
    Command button;
    public CancelAction(){
        this.button = null;
    }
    public CancelAction(Command button){
        this.button = button;
    }
    public void setButton(Command button){
        this.button = button;
    }
    public void execute(){

        button.unDo();
        System.out.println();
    }
    public void unDo(){button.execute();};
    public String getInfo() {
        return "Cancel";
    }
}
