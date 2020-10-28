import java.util.Random;

public class Color {
    Random randie = new Random();
    int r = randie.nextInt(256);
    int g = randie.nextInt(256);
    int b = randie.nextInt(256);

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    };

    public void random() {
        int r = randie.nextInt(256);
        int g = randie.nextInt(256);
        int b = randie.nextInt(256);
    };

    public void brightness () {
        
    }

};

