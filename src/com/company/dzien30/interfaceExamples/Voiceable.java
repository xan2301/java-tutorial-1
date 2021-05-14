package com.company.dzien30.interfaceExamples;

public interface Voiceable {

    String gimmeVoice();

   default void sing(String songName){
       singMeASongWithName(songName);

   }

    private void singMeASongWithName(String songName) {
        System.out.println( "Default singing song method: "+ songName);
    }


}
