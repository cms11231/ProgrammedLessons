public class ColorTester {
    public static void main( String[] args ) {
        Color col1 = new Color();
        Color col2 = new Color(123, 123, 123);

        col1.randomize();
        col1.darken(10);
    
        col2.setRed(300);
        int reeeee = col2.getRed();
        System.out.println(" Color 2: " + reeeee);

        col1.getRed();

      
    }

}