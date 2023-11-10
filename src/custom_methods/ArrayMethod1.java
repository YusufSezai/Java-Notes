package custom_methods;

public class ArrayMethod1 {
    public static  void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        String[] names = {"Yusuf", "Emel", "Hz.Ebubekir", "Azra", "Adil"};

        printArray(names);
    }


}
