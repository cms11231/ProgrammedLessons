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

        int numrolls = 0;
        int rolls = 0;
        int score = 0;
        int scr = 0;

        float four = 0;

        boolean snake = false;


        System.out.println("Enter number of Simulations: ");
        sim = scan.nextInt();
        dic1 = rand.nextInt(max) + 1;
        dic2 = rand.nextInt(max) + 1;

        for (int i = 0; i < sim; i++) {
            snake = false;
            numrolls = 0;
            score = 0;
            while (!snake) {
                dic1 = rand.nextInt(max) + 1;
                dic2 = rand.nextInt(max) + 1;

                if (dic1 == 1 && dic2 == 1) {
                    if (rolls > 4){
                        four ++;
                    }
                    snake = true;
                    numrolls += rolls + 1;
                    score += scr;
                }  else {
                    scr += dic1 + dic2;
                    rolls++;
                    snake = false;
                }
                
            }
        }
        

        numrolls = numrolls / sim;
        score = score / sim;
        four = (four / sim) * 100;
        
        System.out.println("Average Rolls: " + numrolls);
        System.out.println("Average Score: " + score);
        System.out.println("Percentage of Players w/ 4 + rolls: " + four + "%");
        
	}
}


// I notice that the average tends to be around 35 rolls and a score of 250. Also it is almost garunteed that there will be more than four rolls.