
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUTH
 */
public class Ex01TruthRamos {
     public static void main(String[] args) {
        String subjectA = "Music 4";
        String subjectB = "Physical Education 4";
        String subjectC = "Computer Science 4";
        int minutesA = 50;
        int minutesB = 100;
        int minutesC = 150;
        int gradeLevelA = 10;
        int gradeLevelB = 10;
        int gradeLevelC = 10;
        
        System.out.print(
          "Subject A:" + "\n" + "Name: " + subjectA + "\n" 
          + "Minutes Every Week: " + minutesA + "\n"
          + "Grade Level: " + gradeLevelA + "\n" + "\n"
        );
        
        System.out.print(
          "Subject B:" + "\n" + "Name: " + subjectB + "\n" 
          + "Minutes Every Week: " + minutesB + "\n"
          + "Grade Level: " + gradeLevelB + "\n" + "\n"
        );
        
        System.out.print(
          "Subject C:" + "\n" + "Name: " + subjectC + "\n" 
          + "Minutes Every Week: " + minutesC + "\n"
          + "Grade Level: " + gradeLevelC + "\n" + "\n"
        );
        
        System.out.print (
          "Total Minutes Per Week: " + (minutesA + minutesB + minutesC) +"\n"
        );
        
        System.out.print (
          "Same Grade Level?: " + (gradeLevelA == gradeLevelB && gradeLevelB == gradeLevelC) +"\n"
        );
        
        System.out.print (
          "All Grade 10?: " + (gradeLevelA == 10 && gradeLevelB == 10 && gradeLevelC == 10) +"\n"
        );
        
    }
}
