import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Game{

    private String title;
    Scanner scan = new Scanner(System.in);

    public Game(String title){
        this.title = title;
    }

    public void newGame(){
        for (int i = 1; i <= 4; i++){
            System.out.println("What kind of character is character #" + i + "? (k=knight, p=peasent, c=cleric, m=mage, o=courtier)");
            String kind = scan.nextLine();
            if (kind.equals("k")) {
                int k = 1; k++;
                if (k>2){
                    System.out.println("You cannot have more than two knights.");
                    k--; i--;
                } else {
                    GameCharacter character = new GameCharacter(kind);
                    boolean good = false;
                    String input;
                    while (!good) {
                        character = new GameCharacter(kind);
                        System.out.println("Would you like to keep this character? y/n");
                        input = scan.nextLine();
                        if(input.equals("y")){
                            good = true;
                        } else {
                            good = false;
                        }
                    }        
                }

            } else if (kind.equals("p")) {
                int p = 1; p++;
                if (p>2){
                    System.out.println("You cannot have more than two peasants.");
                    p--; i--;
                } else {
                    GameCharacter character = new GameCharacter(kind);
                    boolean good = false;
                    String input;
                    while (!good) {
                        character = new GameCharacter(kind);
                        System.out.println("Would you like to keep this character? y/n");
                        input = scan.nextLine();
                        if(input.equals("y")){
                            good = true;
                        } else {
                            good = false;
                        }
                    }        
                }
            } else if (kind.equals("c")) {
                int c = 1; c++;
                if (c>2){
                    System.out.println("You cannot have more than two clerics.");
                    c--; i--;
                } else {
                    GameCharacter character = new GameCharacter(kind);
                    boolean good = false;
                    String input;
                    while (!good) {
                        character = new GameCharacter(kind);
                        System.out.println("Would you like to keep this character? y/n");
                        input = scan.nextLine();
                        if(input.equals("y")){
                            good = true;
                        } else {
                            good = false;
                        }
                    }        
                }
            } else if (kind.equals("m")) {
                int m = 1; m++;
                if (m>2){
                    System.out.println("You cannot have more than two mages.");
                    m--; i--;
                } else {
                    GameCharacter character = new GameCharacter(kind);
                    boolean good = false;
                    String input;
                    while (!good) {
                        character = new GameCharacter(kind);
                        System.out.println("Would you like to keep this character? y/n");
                        input = scan.nextLine();
                        if(input.equals("y")){
                            good = true;
                        } else {
                            good = false;
                        }
                    }        
                }
            } else if (kind.equals("o")) {
                int o = 1; o++;
                if (o>2){
                    System.out.println("You cannot have more than two Courtiers.");
                    o--; i--;
                } else {
                    GameCharacter character = new GameCharacter(kind);
                    boolean good = false;
                    String input;
                    while (!good) {
                        character = new GameCharacter(kind);
                        System.out.println("Would you like to keep this character? y/n");
                        input = scan.nextLine();
                        if(input.equals("y")){
                            good = true;
                        } else {
                            good = false;
                        }
                    }        
                }
            } 
        }
    }
}