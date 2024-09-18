
public class Exercicio24 {

    public static void main(String[] args) {
        int start = 13;
        int end = 23;
        System.out.println("Números pares entre 13 e 23: ");
        do {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        } while (start < end);
    }

}
