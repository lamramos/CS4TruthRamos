/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author TRUTH
 */
public class Ex02TruthRamos {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.print("Welcome to Higher or Lower! What will you do?"
        + "\n" + "Start game"
        + "\n" + "Change settings"
        + "\n" + "End application" + "\n"
      ); 
      String actionChoice = sc.nextLine();
      //initial action prompt
      
      switch(actionChoice){
          
          case "Start game":
            int random = (int) Math.floor(Math.random()*10) + 1;
            //random number 
            
            int i = 0;
            while (i < 3) {
                System.out.print("You have" + (3-i) + "guess(es) left. What is your guess? ");
                int guess = sc.nextInt();
                if (random == guess) {      
                    System.out.print("You got it!");
                }
            }
            
          break;    
          
          case "Change settings":
              
          break;
          
          case "End application":
              
          break;
          
          default:
            System.out.print("Please copy one of the given choices.");
            
      }
      
    }
}
