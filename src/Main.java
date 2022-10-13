import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Die die = new Die();
    Scanner sc = new Scanner(System.in);

    System.out.println("Hello, player 1 whats your name?");
    Player p1 = new Player(sc.nextLine());
    System.out.println("Hello, player 2 whats your name?");
    Player p2 = new Player(sc.nextLine());


        System.out.println(die.roll());
    }
}