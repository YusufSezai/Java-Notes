package custom_methods;

import java.util.ArrayList;

public class FindTerms {
    public static boolean findTerm(String s, ArrayList<String> myString) {

        for (int i = 0; i < myString.size(); i++) {
            if (s.equals(myString.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String x = "Azra";
        ArrayList<String> names = new ArrayList<String>();
        names.add("Yusuf");
        names.add("Emel");
        names.add("Ebubekir");
        names.add("Azra");
        names.add("Adil");
        System.out.println(findTerm(x,names));
    }
}
