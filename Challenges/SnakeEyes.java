import java.util.Scanner;
import java.util.Random;
public class SnakeEyes {
    	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int max = 6;
        int sim = 0;
        int dic1 = 0;
        int dic2 = 0;


        double numrolls = 0;
        int rolls = 0;
        double score = 0;
        int scr = 0;

        double four = 0;

        boolean snake = false;


        System.out.println("Enter number of Simulations: ");
        sim = scan.nextInt();

        for (int i = 0; i < sim; i++) {
            snake = false;
            score = 0;
            rolls = 0;

            while (!snake) {
                dic1 = rand.nextInt(max) + 1;
                dic2 = rand.nextInt(max) + 1;
                rolls++;
                if (dic1 == 1 && dic2 == 1) {
                    snake = true;
                    numrolls += rolls;
                    score += scr;
                    if (rolls > 4){
                        four++;
                    }

                }  else {
                    scr += dic1 + dic2;
                    snake = false;

                }

                
            }

        }
        
        System.out.println("4: " + four);
        System.out.println("sim: " + sim);

        numrolls = numrolls / sim;
        score = score / sim;
        four = (four / (double)sim) * 100;
        
        System.out.println("Average Rolls: " + numrolls);
        System.out.println("Average Score: " + score);
        System.out.println("Percentage of Players w/ 4 + rolls: " + four + "%");
        
	}
}


// I notice that the average tends to be around 35 rolls and a score of 250. Also it is almost garunteed that there will be more than four rolls.