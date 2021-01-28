public class arrays {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5};
        swapEnds(nums);

        int[] seven = {1, 2, 3, 4, 5};
        hasSeven(seven);

        // System.out.println("Hip, hip, h-array");


        // int x = 10;

        // int[] numbers = new int[x]; // arrays need a size, the size of this one is the integer x, which is 10

        // numbers[0] = 1;
        // numbers[0] += 2;
        // int y = numbers[0] - 1;
        // System.out.println(numbers[0]);

        
        // //iteration
        // // int i = 0;
        // while(i<numbers.length){
        //     System.out.println(numbers[i]);
        //     i++;
        // }

        // for(int i = 0; i<numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        // //            0  1  2  3  4  5
        // int[] nums = {3, 4, 8, 9, 9, 10};

        // int numNines = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if (nums[i] == 9){
        //         numNines++;
        //     }
        //     System.out.println(numNines);
        // }


        // //forEach, same as above
        // for(int nums : nums){
        //     if(num == 9){
        //         numNines++;
        //     }
        //     System.out.println(numNines);
        // }


        // // assumptions
        // // * touch all elements
        // // * one by one
        // // * front to back
        // // * array itslef cannot be changed midloop

        // public static void printArray(int[] nums){
        //     System.out.println(nums);
        // }





        // int nums[] = {1, 2, 3, 4, 5}; // [2, 3]
        // for(int i = 0; i < nums.length; i++){
        //     System.out.println(numbers[i]);
        // }



    }
    
    public static void swapEnds(int[] nums){
        System.out.println("Swap Ends:");
        
        
        for(int n : nums){
            System.out.print(n);
        }
        
        int x; int y;
        x = nums[0];
        y = nums[nums.length - 1];
        nums[0] = y;
        nums[nums.length -1] = x;

        for(int n : nums){
            System.out.print(n);
        }
        System.out.println("\n");
    }

    public static void hasSeven(int[] seven){
        System.out.println("Has Seven:");
        
        
        for(int s : seven){
            System.out.print(s);
        }
        
        boolean hasSev = false;
        for(int i = 0; i < seven.length; i++){
            
            if(seven[i] == 7){
                hasSev = true;
                System.out.println("\nThere is a seven");
            }
        }

        System.out.println("\n");
    }

}