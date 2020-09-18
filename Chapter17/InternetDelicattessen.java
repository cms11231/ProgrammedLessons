import java.util.Scanner;

public class InternetDelicattessen {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String item;
			double price;
			boolean delivery;

			System.out.println("Enter the item: ");
			item = scan.nextLine();
            
            System.out.println("Enter the price: ");
			price = scan.nextDouble();
            
            System.out.println("Overnight delivery (0==no, 1==yes): ");
			delivery = scan.nextBoolean();

			double totall;
			double deliveryPrice = 3;
			double totalDelivery;
			if (price < 10) {
				if (delivery) {
					totall = price + deliveryPrice + 2;
					totalDelivery = deliveryPrice + 2;
				} else {
					totall = price + 2;
					totalDelivery = 2;
				}
			} else {
				if (delivery) {
					totall = price + 3;
					totalDelivery = 3;
				} else {
					totall = price;
					totalDelivery = 0;
				}
			}

			System.out.println("Invoice:\n" + item + "\t" + price + "\n\tDelivery" + totalDelivery + "\n\tTotal" + total);


		}
		

}