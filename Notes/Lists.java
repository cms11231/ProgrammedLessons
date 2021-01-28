import java.util.ArrayList;
import java.util.Arrays;

public class Lists {

    public static void main(String[] args){


        //lists are expandable. You dont have to give it a size, and it can be changes

        // ArrayList list = new ArrayList();
        // needs to know type of thing
        //          v

        ArrayList<String> list = new ArrayList<String>();
        list.add("apple"); //array[0] = "apple"
        list.add("blueberry"); //{"apple", "blueberry"}
        list.get(1); //"blueberry"
        list.set(1, "new word"); //{"new word", "blueberry"}
        list.size(); //basically array.length
        list.remove("blueberry");

        for (int i = 0; list.size() > i; i++){
            System.out.println(list.get(i));
            list.remove("b");
        }


        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(Integer.valueOf(3));
        int x = nums.get(0).intValue() + 1;
        

    }
}