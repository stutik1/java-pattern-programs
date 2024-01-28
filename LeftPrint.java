public class LeftPrint {
        public static void leftPrint(int n) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < n  - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int n=7;
            leftPrint(n);
        }
    }

