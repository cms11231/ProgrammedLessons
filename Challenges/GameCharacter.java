import java.util.Random;

public class GameCharacter{
    private String title;
    private String kind;
    private Integer strength, tough, intel, magic, influ;
    Random random = new Random();
    Integer all;

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
                //reroll
            }
        } else if (kind.equals("p")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(4) + 7;
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                //reroll
            }
        } else if (kind.equals("c")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(4) + 7;
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                //reroll
            }
        } else if (kind.equals("m")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(4) + 7;
            this.influ = random.nextInt(6);
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                //reroll
            }
        }    else if (kind.equals("o")) {
            this.strength = random.nextInt(6);
            this.tough = random.nextInt(6);
            this.intel = random.nextInt(6);
            this.magic = random.nextInt(6);
            this.influ = random.nextInt(4) + 7;
            all = strength + tough + intel + magic + influ;
            if (all > 28 || all < 8) {
                //reroll
            }
        }
    }



}