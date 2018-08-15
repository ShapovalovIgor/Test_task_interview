package ru.shapovalov.testtask;

public class HelloEight {
    private HelloEight INSTANCE;

    public HelloEight(){
       INSTANCE = this;
    }

    public HelloEight getINSTANCE(){
        return INSTANCE;
    }


    public static void main(String[] args){
        HelloEight helloEight = new HelloEight();
        helloEight.getINSTANCE();
    }
}
