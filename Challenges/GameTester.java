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
                output.println(title);

                for (int i = 1; i <= 4; i++){
                    int k = 1;
                    int p = 1;
                    int c = 1;
                    int m = 1;
                    int o = 1;
                    System.out.println("What kind of character is character #" + i + "? (k=knight, p=peasent, c=cleric, m=mage, o=courtier)");
                    String kind = scan.nextLine();
                    if (kind.equals("k")) {
                        k++;
                        if (k>2){
                            System.out.println("You cannot have more than two knights.");
                            k--; i--;
                        } else {
                            boolean good = false;
                            String input;
                            while (!good) {
                                GameCharacter character = new GameCharacter(kind);
                                System.out.println(character);
                                System.out.println("Would you like to keep this character? y/n");
                                input = scan.nextLine();
                                if(input.equals("y")){
                                    good = true;
                                    character.setName(scan.nextLine());
                                    output.println(character);
                                } else {
                                    good = false;
                                }
                            }        
                        }
        
                    } else if (kind.equals("p")) {
                        p++;
                        if (p>2){
                            System.out.println("You cannot have more than two peasants.");
                            p--; i--;
                        } else {
                            boolean good = false;
                            String input;
                            while (!good) {
                                GameCharacter character = new GameCharacter(kind);
                                System.out.println(character);
                                System.out.println("Would you like to keep this character? y/n");
                                input = scan.nextLine();
                                if(input.equals("y")){
                                    good = true;
                                    character.setName(scan.nextLine());
                                    output.println(character);
                                } else {
                                    good = false;
                                }
                            }        
                        }
                    } else if (kind.equals("c")) {
                        c++;
                        if (c>2){
                            System.out.println("You cannot have more than two clerics.");
                            c--; i--;
                        } else {
                            boolean good = false;
                            String input;
                            while (!good) {
                                GameCharacter character = new GameCharacter(kind);
                                System.out.println(character);
                                System.out.println("Would you like to keep this character? y/n");
                                input = scan.nextLine();
                                if(input.equals("y")){
                                    good = true;
                                    character.setName(scan.nextLine());
                                    output.println(character);
                                } else {
                                    good = false;
                                }
                            }        
                        }
                    } else if (kind.equals("m")) {
                        m++;
                        if (m>2){
                            System.out.println("You cannot have more than two mages.");
                            m--; i--;
                        } else {
                            boolean good = false;
                            String input;
                            while (!good) {
                                GameCharacter character = new GameCharacter(kind);
                                System.out.println(character);
                                System.out.println("Would you like to keep this character? y/n");
                                input = scan.nextLine();
                                if(input.equals("y")){
                                    good = true;
                                    output.println(character);
                                } else {
                                    good = false;
                                }
                            }        
                        }
                    } else if (kind.equals("o")) {
                        o++;
                        if (o>2){
                            System.out.println("You cannot have more than two Courtiers.");
                            o--; i--;
                        } else {
                            boolean good = false;
                            String input;
                            while (!good) {
                                GameCharacter character = new GameCharacter(kind);
                                System.out.println(character);
                                System.out.println("Would you like to keep this character? y/n");
                                input = scan.nextLine();
                                if(input.equals("y")){
                                    good = true;
                                    character.setName(scan.nextLine());
                                    output.println(character);
                                } else {
                                    good = false;
                                }
                            }        
                        }
                    } 
                    FileWriter writer = new FileWriter(file);
                    writer.write(title + "\n" + character + "\n" + character + "\n" + character + "\n" + character);
                    writer.close();
                }
            } else if (choice==2){
                System.out.println("Enter the title of the file you want to check:\n--> ");
                title = scan.nextLine();
                file = new File(title);
                scan = new Scanner(file);

                Character character;

                scan.nextLine();
                if (scan.hasNextLine()){
                    String[] parameters = scan.nextLine().split(",");
                    character = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    if (character.moreThanTwo()) {
                        System.out.println("There are more than two of a certain character type in this file.");
                    }
                    if (character.tooHighOrLow()) {
                        System.out.println("This character has too many or too little status points.");
                    }
                }
                break;
            } else if (choice==3){
                System.out.println("Enter the title of the game:\n--> ");
                title = scan.nextLine();
                file = new File(fileName);
                scan = new Scanner(file);

                String[] parameters = scan.nextLine().split(",");
                Character character = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                System.out.println(character);

                System.out.println("Enter the name of the Character you are rolling again:");
                String changeChar = scan2.nextLine();
                if (changeChar.equals(character.getName())) {
                    character.reroll(character);
                    System.out.println("Now randomization -->" + character );
                } else 

                break;
            } else if (choice==4){
                scan.close();
                System.exit(0);
                break;
            }

            System.out.println(choices);
            choice = scan.nextInt();

        }

    }}

