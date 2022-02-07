package com.company.dzien38;

public class Cat implements CatStrokeable, Voiceable{

    @Override
    public void doSomethingAsStrokeableCat() {
        System.out.println(" I like being stroked");

    }

    @Override
    public void beStroked() {
        System.out.println(" I am stroked");

    }

    @Override
    public String gimmeVoice() {
        return " I'm giving You my voice ";
    }

    @Override
    public void sing(String songName) {

        System.out.println("I singing the song " + songName);

    }
}
