/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03truthramos;

/**
 *
 * @author TRUTH
 */
public class Song {
    String title, genre;
    int year, length, timesPlayed;
    
    public Song (String title, String genre, int year, int length, int timesPlayed) {
       this.title = title;
       this.genre = genre;
       this.year = year;
       this.length = length;
       this.timesPlayed = timesPlayed;
    }
}
