import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reverso = reverso(input);
        System.out.println("String invertida: " + reverso);
    }

    public static String reverso(String str) {
        char[] characters = str.toCharArray();
        int i = 0;
        int x = str.length() - 1;

        while (i < x) {
            char temp = characters[i];
            characters[i] = characters[x];
            characters[x] = temp;
            i++;
            x--;
        }

        return new String(characters);
    }
}