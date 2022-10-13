import java.util.ArrayList;

public class Player {


    String name;
    int points;
    ArrayList<Die> howManyDice;
    Die die = new Die();

    public Player(String name, int points, ArrayList<Die> howManyDice) {
        this.name = name;
        this.points = points;
        this.howManyDice = howManyDice;
    }
    public Player(String name, ArrayList<Die> howManyDice){

    }
    public Player(String name){

    }


    public int getPoints() {
        return points;
    }

 public void rollDice(){
die.roll();

    }

     //○Skall rulla alla tärningar i spelarens tärnings-lista.

 public int getDieValue() {
     // ○ Skall summera och returnera värdet på spelarens alla tärningar i form av ett heltal.
 return 1;}

 public void increaseScore(){


 }
         //   ○ Skall öka spelarens poäng med ett.
            //
            public void addDie(int sides){ }
            //Skapar en ny tärning med sidor sides och lägger till den till spelaren.
}
