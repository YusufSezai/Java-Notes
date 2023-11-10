package mutability;

class Player {
    int health;
    int score;
    int level;

    Player(){
        health = 100;
        score = 0;
        level = 1;
    }
}


public class ExternalMethods01 {
    public static void main(String[] args) {

        Player player1 = new Player();

        printPlayer(player1);

        player1.health -= 20;
        player1.score += 35;
        player1.level +=2;

        printPlayer(player1);

    }

    public static void printPlayer(Player p) {
        if (p.health <= 0) {
            System.out.println("This player is dead. They died on level " + p.level + " with a score of " + p.score + ".");
        } else {
            System.out.println("This player has " + p.health + " health, a score of " + p.score + " and is on level   " + p.level);
        }
    }
}
