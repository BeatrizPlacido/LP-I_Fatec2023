package estruturas;

public class EX77{
    public static void main(String[] args) {

        int[] v = {5, 1, 4, 2, 7, 8, 3, 6 };
        int aux;


        for (int i = 7; i >= 5; i--) {
            aux = v[i];
            v[i] = v[8 - i];
            v[8 - i] = aux;
        }

        for (int i = 0; i < 8; i ++){
            System.out.print(v[i] + " ");
        }
    }
}