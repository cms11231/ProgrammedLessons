import java.util.Random;

public class Color {
    Random randie = new Random();
    public int red = randie.nextInt(256);
    public int green = randie.nextInt(256);
    public int blue = randie.nextInt(256);

    double brighter;
    double darker;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void makeRandom() {
        int red = randie.nextInt(256);
        int green = randie.nextInt(256);
        int blue = randie.nextInt(256);
    }

    public void changeBrightness (double percent) {
        red *= (1 + ((double)percent / 100));
		green *= (1 + ((double)percent / 100));
        blue *= (1 + ((double)percent / 100));
    }

    public void changeDarkness (double percent) {
        red *= (1 + ((double)percent / 100));
		green *= (1 + ((double)percent / 100));
        blue *= (1 + ((double)percent / 100));
    }

    public void setRed (int red) {
        this.red = red;
    }

    public void setGreen (int green) {
        this.green = green;
    }

    public void setBlue (int blue) {
        this.blue = blue;
    }

    public void getRed () {
        return this.r;
    }

    public void getGreen () {
        return this.g;
    }

    public void getBlue () {
        return this.b;
    }

}

