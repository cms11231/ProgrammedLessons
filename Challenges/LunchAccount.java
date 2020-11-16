public class LunchAccount{
    private double balance;
    private int price;
    private int id;
    public int totalMoneySpent = 0;
    private static int idcount = 0;
    private static int lunchesSold = 0;
    private static boolean first100 = false;




    public LunchAccount() {
        this.id = idcount + 1000;
        this.balance += balance;
        this.idcount++;
        if (id<1100) {
            this.balance += 20;
            first100 = true;
        }
    }
    
    public LunchAccount( double balance ) {
        this.id = idcount + 1000;
        this.idcount++;
        if (id<1100) {
            this.balance += 20;
            first100 = true;
        }
    }
    
    public addBalance( double add) {
        this.balance += add;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    public buyFood ( int price ) {
        if ( balance >= price) {
            balance -= price;
            lunchesSold ++;
            totalMoneySpent += price;
        } else {
            return "Error: Not enough funds";
        }
    }


}