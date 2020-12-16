import java.io.PrintWriter;
import java.util.Scanner;

public class GameTester{
    public static void main(String[] args){

        File file;
        Scanner filescan = new Scanner(yayy.md);
        Scanner scan = new Scanner(System.in);
        PrintWriter output = new PrintWriter(yayy.md);
        String namee;
        String title;
        Integer choice;
        String choices = "Menu:\n-1- Create a new game\n-2- Validate a save file\n-3- Reroll/Randomize Existing Character\n-4- Quit :(";

        System.out.println(choices);
        choice = scan.nextLine();

        while(choice>0 && choice<=4){

            if (choice==1){
                System.out.println("Enter the title of your new game:\n--> ");
                String title = scan.nextString();
                Game game = new Game(title);
                break;
            } else if (choice==2){
                System.out.println("Enter the title of the game you want to validate:\n--> ");
                title = scan.nextString();
                break;
            // } else if (choice==3){
            //     System.out.println("Enter the title of the game:\n--> ");
            //     title = scan.nextString();
            //     // game.reRoll(namee);
            //     break;
            } else if (choice==4){
                scan.close();
                scan.close();
                System.exit(0);
                break;
            }

            System.out.println(choices);
            choice = scan.nextInt();

        }

    }

}