public class atv2 {
    public static void main(String[] args) {
        atv2 fib = new atv2();
        System.out.println(fib.atv2(4));

    }

    public String atv2(int x) {
        int a = 0, b = 1;
        int soma = a + b;
        if (x == 0 || x == 1) {
            return "é parte da fibonacci";
        }
        while (soma <= x) {
            if (soma == x) {
                return "é parte da fibonacci";
            }
            a = b;
            b = soma;
            soma = a + b;
        }
        return "Não é parte da fibonnaci";
    }
}