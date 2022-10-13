import java.util.Random;

public class Die {
    private int sides;
    private int value;

    final private static Random random = new Random();

    public Die() {

    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;


    }

    public int roll() {
     this.value=random.nextInt(sides)+1;

    return value;}

    @Override
    public String toString() {
        return super.toString();


    }


}