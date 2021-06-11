package com.example;
import java.util.ArrayList;
public class MsgOut {
    private ArrayList<String> messageList = new ArrayList<>();

    public ArrayList<String> getMessageList() {
        return messageList;
    }
    public void println(String message){
    messageList.add(message);
    }
    public void printToConsole(){
        for (String msg : messageList) {
            System.out.println(msg);
        }
    }
}
