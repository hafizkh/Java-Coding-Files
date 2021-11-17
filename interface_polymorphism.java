package com.company;

public class interface_polymorphism {
    public static void main(String[] args) {
        /*
        Question: Explanation about the Interface and Polymorphism concept in this exercise where i took the
        examples of smartphone and try to explain different features in it like Camera, Wifi, Connecting to the network
        etc.
         */

        //  Making the Object of smartphone
        MySmartPhone sp = new MySmartPhone();
        sp.connectNetwork("Imaad");
        String [] arr = sp.getNetwork();
        for (String item:arr) {
            System.out.println(item);
        }
        sp.callNumber(564);
        sp.recordVideo();
        sp.takeSnap();
        sp.record4kVideo();
        System.out.println("********Polymorphism*********");

        // Making the Object of camera with reference to the smartphone.
        MyCamera camera = new MySmartPhone();
        camera.recordVideo();
        camera.takeSnap();
        System.out.println("****************************");

        // Making the Object of Wifi with reference to the smartphone
        MyWifi wifi = new MySmartPhone();
        wifi.getNetwork();
        wifi.connectNetwork("Hafiz's Iphone");


    }
}
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning to Everybody");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording the 4k Video");
    }
}
interface MyWifi{
    String [] getNetwork();
    void connectNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling to the " +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting to the call...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking a picture from the cam");
    }
    public void recordVideo(){
        System.out.println("The camera is recording the video");
    }
    public String [] getNetwork(){
        System.out.println("Getting the list of Network");
        String [] networkList = {"Hafiz" , "Hamk Visitor" , "frying Pan"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to the Network " +network);
    }
}