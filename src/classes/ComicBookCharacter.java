package classes;

public class ComicBookCharacter {
    String name;
    int age;
    String type;

    ComicBookCharacter(String n, int a, String t) {
        name = n;
        age = a;
        type = t;
    }

    ComicBookCharacter(ComicBookCharacter c) {
        name = c.name;
        age = c.age;
        type = c.type;
    }

}
