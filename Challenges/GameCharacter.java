import java.util.Random;

public class GameCharacter{
    private String title;
    private String kind;
    private Integer strength, tough, intel, magic, influ;
    Random random = new Random();
    private Integer all;

    public GameCharacter(String kind) {
        this.kind = kind;
        if (kind.equals("k")) {
            this.strength = random.nextInt(4) + 7;
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                reroll();
            }
        } else if (kind.equals("p")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(4) + 7;
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                reroll();
            }
        } else if (kind.equals("c")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(4) + 7;
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                reroll();
            }
        } else if (kind.equals("m")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(4) + 7;
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                reroll();
            }
        }    else if (kind.equals("o")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(4) + 7;
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                reroll();
            }
        }

    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void reroll() {
        if (kind.equals("k")) {
            this.strength = random.nextInt(4) + 7;
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
        } else if (kind.equals("p")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(4) + 7;
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
        } else if (kind.equals("c")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(4) + 7;
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
        } else if (kind.equals("m")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(4) + 7;
            this.influ = random.nextInt(6);
        }    else if (kind.equals("o")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(4) + 7;
        }

    }

    public boolean tooHighOrLow(){
        int all = strength + tough + intel + magic + influ;
        if (all > 28 || all < 8) {
            TooHighOrLow = true;
        }
        TooHighOrLow = false;
    }

    public boolean moreThanTwo(){
        int all = strength + tough + intel + magic + influ;
        if (k > 2 || p > 2 || c > 2 || m > 2 || 0 > 2) {
            TooHighOrLow = true;
        } else {
        TooHighOrLow = false;
        }
    }

    public GameCharacter(String[] parameters) {
        this(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
    }
    
    public String toString() {
        if (title == null) {
            return kind + "," + strength + "," + tough + "," + intel + "," + magic + "," + influ;
        } else {
            return name + "," + kind + "," + strength + "," + tough + "," + intel + "," + magic + "," + influ;
        }
    }
    
}