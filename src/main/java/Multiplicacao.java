public class Multiplicacao {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]), result = 1;
        while (y > 0) {
            y--;
            result = result * x;
        }
        System.out.println(result);

    }
}
