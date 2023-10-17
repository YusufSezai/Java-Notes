public class ForLoop03 {
    public static void main(String[] args) {
        String[] names = {"Ariselda", "Emel", "Rashit", "Stiop", "Yusuf"};
        int count = 0;
        for (String name : names) {
            count += 1;
            System.out.println(count + " : " + name);
        }
    }
}
