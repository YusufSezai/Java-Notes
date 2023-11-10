package classes;

public class Actor01 {
    String firstName;
    String lastName;
    String birthday;
    int totalFilms;
    int oscarNominations;
    int oscarWins;
    static String union = "Screen Actors Guild";
    static final String BOBO = "Lolo";

    Actor01(String fn, String ln, String bd, int tf) {
        firstName = fn;
        lastName = ln;
        birthday = bd;
        totalFilms = tf;
        oscarNominations = 0;
        oscarWins = 0;
    }

    public static void main(String[] args) {
        Actor01 helen = new Actor01("Helen", "Mirren", "July 26", 80);
        Actor01 tom = new Actor01("Tom", "Hanks", "July 9", 76);
        Actor01 denzel = new Actor01("Denzel", "Washington", "December 28", 47);
        helen.oscarNominations = 4;
        tom.oscarNominations = 5;
        denzel.oscarNominations = 8;
        helen.oscarWins = 1;
        tom.oscarWins = 2;
        denzel.oscarWins = 2;
        tom.union = "Teamsters";
        System.out.println(denzel.firstName + " " + denzel.lastName);
        System.out.println(helen.firstName + " " + helen.lastName);
        System.out.println(tom.firstName + " " + tom.lastName + " won " + tom.oscarWins + " Oscar out of " + tom.oscarNominations + " nominations");
        System.out.println(helen.union);
        System.out.println(tom.union);
    }
}
