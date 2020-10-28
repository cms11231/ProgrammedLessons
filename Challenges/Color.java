import java.util.Random;

public class Color {
    Random randie = new Random();
    int red = randie.nextInt(256);
    int green = randie.nextInt(256);
    int blue = randie.nextInt(256);

    double brighter;
    double darker;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    };

    public void makeRandom() {
        int red = randie.nextInt(256);
        int green = randie.nextInt(256);
        int blue = randie.nextInt(256);
    };

    public void changeBrightness (double brighter) {
        red *= (1 + ((double)percent / 100));
		green *= (1 + ((double)percent / 100));
        blue *= (1 + ((double)percent / 100));
    }

    public void changeDarkness (double darker) {
        red *= (1 - ((double)percent / 100));
		green *= (1 - ((double)percent / 100));
        blue *= (1 - ((double)percent / 100));
    }

    public void changeRed (int red) {
        this.red = red;
    }

    public void changeGreen (int green) {
        this.green = green;
    }

    public void changeBlue (int blue) {
        this.blue = blue;
    }

    public void pullRed () {
        system.out.println("red --> " + red);
    }

    public void pullGreen () {
        system.out.println("green --> " + green);
    }

    public void pullBlue () {
        system.out.println("blue --> " + blue);
    }

};

