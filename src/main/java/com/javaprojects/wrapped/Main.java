package com.javaprojects.wrapped;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String prompt = "Your History";
        System.out.println(prompt);
//        String[] splitPrompt = prompt.split("z");
//        System.out.println("aftersplit: " + Arrays.toString(splitPrompt));
        try{
        FileReader reader = new FileReader("src/main/resources/listening_history.csv");
        BufferedReader bufReader = new BufferedReader(reader);
        String currentLine;
        while( (currentLine = bufReader.readLine()) != null){
            String [] songInfo = currentLine.split("[|]");
            System.out.println(songInfo[2]);
            String songName = songInfo[0];
            String artistName = songInfo[1];
            String genre = songInfo[2];
//            System.out.println(Arrays.toString(songInfo));
//            System.out.println(artistName);
//            System.out.println(genre + ", " + songName);
//            hip hop gnx
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}