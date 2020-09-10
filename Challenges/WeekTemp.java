public class WeekTemp
{  
    public static void main ( String[] args )  
    {
        int[] months = {0, 1, 2, 3, 4, 5, 96};

        int average = (months[0] + months[1] + months[2] + months[3] + months[4] + months[5] + months[6]) / 7;

        System.out.println ("Sunday: " + months[0] + "\nMonday: " + months[1] + "\nTuesday: " + months[2] + "\nWednesday: " + months[3] + "\nThursday: " + months[4] + "\nFriday: " + months[5] + "\nSaturday: " + months[6] + "\nAverage: " + average);

    }
}