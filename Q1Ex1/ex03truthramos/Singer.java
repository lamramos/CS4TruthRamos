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
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int audienceSize) {
        noOfPerformances++;
        earnings = earnings + (audienceSize*100);
    }
    
    public void changeFavSong (Song newSong) {
        favoriteSong = newSong;
    }
    
    public void checkEarnings () {
        System.out.print(name + " has earned " + earnings + ".");   
    }
    
    public void checkNoOfPerformances () {
        System.out.print(name + " has performed " + noOfPerformances + " times.");   
    }
    
    public void checkFavSong () {
        System.out.print(name + "'s favorite song is " + favoriteSong + ".");   
    }
}
