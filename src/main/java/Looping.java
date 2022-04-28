public class Looping {
    public static void main(String[] args) {
        int rows = 6;
        int n = 2;
        for (int i = rows; i >= 1; i--) {
            for (int j = n; j <= rows; j++) {
                System.out.print(j + " ");
            }
            rows++;
            n = n +2;
            System.out.println();
        }

    }
}
