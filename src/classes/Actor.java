package classes;

public class Actor {
    String firstName;
    String lastName;
    String birthday;
    int totalFilms;
    int oscarNominations;
    int oscarWins;

    Actor() {
        firstName = "Helen";
        lastName = "Mirren";
        birthday = "July 26";
        totalFilms = 80;
        oscarNominations = 4;
        oscarWins = 1;
    }

    public static void main(String[] args) {
        Actor helen = new Actor();
        System.out.println(helen.firstName + " " + helen.lastName);
        System.out.println(helen.firstName + " " + helen.lastName + " won " + helen.oscarWins + " Oscar out of " + helen.oscarNominations + " nominations");
    }

}
