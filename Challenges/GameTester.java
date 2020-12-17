import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class GameTester{
    public static void main(String[] args) throws IOException {

        File file;
        Scanner filescan;
        Scanner scan = new Scanner(System.in);
        PrintWriter output;
        String namee;
        String title = "Unnamed Game";
        Integer choice;
        String choices = "Menu:\n-1- Create a new game\n-2- Validate a save file\n-3- Reroll/Randomize Existing Character\n-4- Quit :(";

        System.out.println(choices);
        choice = scan.nextInt();

        while(choice>0 && choice<=4){

            if (choice==1){
                System.out.println("Enter file name");
                String fileName = scan.nextLine();
                fileName = scan.nextLine();
                file = new File(fileName);
                output = new PrintWriter(new FileWriter(file, true));
                System.out.println("Enter the title of your new game:\n--> ");
                title = scan.nextLine();
                // Game game = new Game(title);
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
            } else if (choice==2){
                System.out.println("Enter the title of the game you want to validate:\n--> ");
                title = scan.nextLine();
                break;
            // } else if (choice==3){
            //     System.out.println("Enter the title of the game:\n--> ");
            //     title = scan.nextString();
            //     // game.reRoll(namee);
            //     break;
            } else if (choice==4){
                scan.close();
                System.exit(0);
                break;
            }

            System.out.println(choices);
            choice = scan.nextInt();

        }

    }

}