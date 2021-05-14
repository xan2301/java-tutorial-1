package com.company.dzien30.interfaceExamples;


import java.io.Serializable;

public class Cat implements CatStrokeable, Voiceable {
        @Override
        public void doSomethingStrokeableCat() {
            System.out.println("I liked being stroked!!!");

        }

        @Override
        public void beStroked() {
            System.out.println("I like it");

        }

        @Override
        public String gimmeVoice() {
            return "I'm giving you my voice";
        }

        @Override
        public void sing(String songName) {
            System.out.println("I'm singing a song:" + songName);

        }
    }


