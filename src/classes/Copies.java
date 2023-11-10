package classes;

public class Copies {

    public static void main(String[] args) {
        ComicBookCharacter a = new ComicBookCharacter("Calvin", 6, "human");
       /*
        a.name = "Calvin";
        a.age = 6;
        a.type = "human";
       */
        ComicBookCharacter b = new ComicBookCharacter(a);
        a.name = "Hobbes";

        System.out.println("Object a name: " + a.name);
        System.out.println("Object b name: " + b.name);
    }
}
