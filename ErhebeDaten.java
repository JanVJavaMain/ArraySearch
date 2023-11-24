import java.util.Scanner;

public class ErhebeDaten {
    private int arr1[] = {0,0,0,0,0,0,0,0};
    private int arr2[] = {0,0,0,0,0,0,0,0};

    public ErhebeDaten() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie acht Zahlen ins erste Array ein:");
        for (int i = 0; i < 8; i++) {
            int a = sc.nextInt();
            arr1[i] = a;
            System.out.println(a + " wurde eingetragen.");
        }

        System.out.println("Bitte geben sie acht Zahlen ins zweite Array ein:");
        for (int i = 0; i < 8; i++) {
            int a = sc.nextInt();
            arr2[i] = a;
            System.out.println(a + " wurde eingetragen.");
        }

        sc.close();
    }

    public int[] getArray1() {
        return this.arr1; 
    }
    public int[] getArray2() {
        return this.arr2; 
    }
}
