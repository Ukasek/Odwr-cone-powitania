import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");
        for (int i = 0; i < names.length; i++)
            names[i] = read.nextLine();

        for (int i = names.length - 1; i >= 0; i--)
            System.out.println("Cześć " + names[i]);


    }
}
