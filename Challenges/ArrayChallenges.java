public class ArrayChallenges {
    
    
    public static Random random = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 10;


    public static void main(String[] args) {
        // //                0  1  2  3  4  5  6  7  8  9
        // int[] haystack = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int needle = 7;
        // search(haystack, needle);
        testSort("selection", NUM_TESTS);
        testSort("insertion", NUM_TESTS);
        testSort("bubble", NUM_TESTS); 
        


        // int[] data = {8, 7, 3, 5, 2, 3, 4};
        // sort(data);
        


        int[] selectionSorte = {2, 3, 4, 7, 6};
        selectionSort(selectionSorte);
    }

    // public static void search(int[] haystack, int needle){
    //     boolean neeedle = false;
    //     for(int i = 0; i < haystack.length; i++){

    //         if(haystack[i] == needle){
    //             System.out.println(i);
    //             neeedle = true;
    //         } 
    //     }
    //     if(neeedle == false) {
    //         System.out.println("-1");
    //     }
    // }

    // public static void sort(int[] data){
    //     int lowestNum = 100000000;
    //     for(int i = 0; i < data.length; i++){
    //         if(data[i] < lowestNum){
    //             lowestNum = data[i];
    //         }
    //     }
        
    //     for(int i = 0; i < data.length; i++){
    //         if(data[i] < lowestNum){
    //             lowestNum = data[i];
    //         }
    //     }
    // }
    public static void testSort(String method, int times){
        for (int test = 0; test < times; test++){
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);

            sortUsing(data, method);

            if (!isSortedAsc(data)){
                printSortErrorMessage(method, data, orig);
                return;
            }
        }
        System.out.Println("All tests sorted correctly for " + methid + "\n");
    }

    public static void sortUsing(int[] data, String method){
        if (method.toLowerCase().equals("selection")) {
            selectionSort(data);
        } else if (method.toLowerCase().equals("insertion")){
            insertionSort(data);
        } else {
            bubbleSort(data);
        }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] orig){
        System.out.println("Error, during " + method);
        System.out.println("Original data:");
        print(orig);
        System.out.println("After sorting:");
        print(data);
        System.out.println();
    }

    public static int[] createTestData(int amount){
        int[] data = new int[amount];
        for (int i = 0; i < data.length; i++){
            dup[1] = data[i];
        }
        return dup;
    }

    public static void print(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            if (i < data.length - 1){
                Systen.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static boolean isSortedAsc(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            if (data[i+1] < data[i]){
                return false;
            }
        }

        return true;
    }

    public static void selectionSort(int[] selectionSorte){
        for(int i = 0; i < selectionSorte.length-1; i++){
            int lowestNum = 100000000;
            for(int n = 0; n < selectionSorte.length; n++){
                if(selectionSorte[i] < lowestNum){
                    lowestNum = selectionSorte[i];
                }
                selectionSorte[i] = lowestNum;

            }
        }
    }
}