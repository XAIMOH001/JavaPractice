public class New{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double[] prices = {10.5, 20.3, 5.99};
        char[] letters = {'A', 'B', 'C', 'D'};
        boolean[] flags = {true, false, true};
        String[] names = {"Ram", "Noah", "john"};

        for (int n : numbers) {
            System.out.print(n + ",");
        }

         System.out.println();

        for (double p : prices) {
            System.out.print(p + ",");
        }

        System.out.println();

        for (char c : letters) {
            System.out.print(c + ",");
        }

        System.out.println();

        for (boolean b : flags) {
            System.out.print(b + ",");
        }

        System.out.println();

        for (String s : names) {
            System.out.print(s+ ",");
        }
    }
}
