public class LunchAccount{
    private String name;
    private Integer balance;
    private Integer price;


    public LunchAccount (str name, int balance) {
        this.name = name;
        this.balance = balance;
    }




    public void buylunch(int price){
        this.price += price;
        this.totalpaid += price;
        
    }


}