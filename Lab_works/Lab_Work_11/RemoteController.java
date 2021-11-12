package com.company;

import java.util.*;

public class RemoteController {
    private ArrayList<Command> flipUpCommand = new ArrayList<Command>();
    public int clickNumber;
    public Command cancelBut = new CancelAction();

    public RemoteController(){
        flipUpCommand.add(cancelBut);
    }

    public void AddButton(Command button){
        this.flipUpCommand.add(button);
    }
    public void ClickButton(int numberButton){
        if(numberButton == 0)
        {
            cancelBut = new CancelAction(this.flipUpCommand.get(clickNumber));
            cancelBut.execute();

        }else{
            this.flipUpCommand.get(numberButton).execute();
            clickNumber = numberButton;
        }
    }
}
