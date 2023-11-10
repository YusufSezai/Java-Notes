package stringBasics;

public class Exercise2 {
    public static void main(String[] args) {
        String myString = "Hello Everybody";

        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString);
        }
    } // wronggggggggggggggggggggg
}
/*
for (int i = 0; i < myString.length(); i++) {
  for (int j = 0; j < myString.length(); j++) {
    if (j == myString.length()-1) {
      System.out.println(myString);
    }
    else {
      System.out.print(myString);
    }
  }
}

int len = myString.length();

for (int i = 1; i < len * len + 1; i++) {
  if (i % len == 0) {
    System.out.println(myString);
  }
  else {
    System.out.print(myString);
  }
}
 */



