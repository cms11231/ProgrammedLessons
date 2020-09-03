import java.util.Scanner;


public class Nurse {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String namei = name.next();
        
        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int agei = age.nextInt();
        
        Scanner temp = new Scanner(System.in);
        System.out.println("What is your temperature?");
        int tempei = temp.nextInt();

        Scanner blopre = new Scanner(System.in);
        System.out.println("What is your blood pressure?");
        int bloprei = blopre.nextInt();

        Scanner diabe = new Scanner(System.in);
        System.out.println("Does your family have a history of diabetes?");
        String diabei = diabe.next();

        Scanner disc = new Scanner(System.in);
        System.out.println("Rate your discomfort level from 1 to 10:");
        String discei = disc.next();

        Scanner symp = new Scanner(System.in);
        System.out.println("What is your first symptom?");
        String sympei = symp.nextLine();

        Scanner sympt = new Scanner(System.in);
        System.out.println("If any, What is your second symptom?");
        String sympeii = sympt.nextLine();

        
        System.out.println("\n" + "\n" + "Name: " + namei + "\n" + "Age: " + agei + "\n" + "Temperature: " + tempei + "\n" + "Blood Pressure: " + bloprei + "\n" + "Family history of diabetes? " + diabei + "\n" + "Discomfort level out of 10: " + discei + "\n" + "Symptom 1: " + sympei + "\n" + "Symptom 2: " + sympeii + "\n" + "\n");

    }

}