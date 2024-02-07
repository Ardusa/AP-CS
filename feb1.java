import java.util.ArrayList;

public class feb1 {
    public static ArrayList<Integer> multiplesOf3 = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            multiplesOf3.add(i * 3);

            if ((i) % 2 == 0) {
                multiplesOf3.remove(multiplesOf3.size() - 1);
            }
        }

        System.out.println(multiplesOf3);
    }

}







