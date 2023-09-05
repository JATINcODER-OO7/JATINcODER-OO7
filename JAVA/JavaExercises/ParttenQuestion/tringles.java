package JavaExercises.ParttenQuestion;

public class tringles {

    public static void main(String[] args) {
        partten1(10);
        partten2(11);
        partten3(12);
        partten4(13,15);
        partten5(14);
        partten6(15);
        partten7(16);

    }

    static void partten1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void partten2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void partten3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void partten4(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void partten5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");

            }
            System.out.println();
        }
    }

    static void partten6(int n) {
        for (int i = 0; i <= 2*n; i++) {
            int formula  = i > n ? 2 * n - i: i;
            for (int j = 1; j < formula; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void partten7(int n) {
        for (int i = 1; i < 2*n; i++) {
            int formula  = i > n ? 2 * n - i: i;
            int numofspaces = n - formula;
            for(int s = 0;s<numofspaces;s++){
                System.out.print(" ");
            }
            System.out.print("   ");

            for (int j = 0; j < formula; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
