import java.io.PrintWriter;
import java.util.Scanner;

public class GameTester{
    public static void main(String[] args) throws IOException{

        File file;
        Scanner filescan;
        Scanner scan;
        PrintWriter output;
        output = new PrintWriter(yayy.md);
        filescan = new Scanner(yayy.md);
        scan = new Scanner(System.in);
        String namee;
        String choices = "Menu:\n-1- Create a new game\n-2- Validate a save file\n-3- Reroll/Randomize Existing Character\n-4- Quit :(";

        System.out.println(choices);
        Int choice = scan.nextInt();

        while(choice>0 && choice<=4){

            if (choice==1){
                System.out.println("Enter the title of your new game:\n--> ");
                String title = scan.nextString;
                game = new Game(title);
                break;
            } else if (choice==2){
                System.out.println("Enter the title of the game you want to validate:\n--> ");
                namee = scan.nextString;
                if (game.validate(namee)){
                    System.out.println("All good! :)");
                }
                break;
            } else if (choice==3){
                System.out.println("Enter the title of the game you want to reroll:\n--> ");
                namee = scan.nextString;
                game.reRoll(namee);
                break;
            } else if (choice==4){
                scan.close();
                input.close();
                System.exit(0);
                break;
            }

            System.out.println(choices);
            choice = scan.nextInt;

        }

    }
    
}