import java.util.Scanner;

public class Patterns {

    // Color Codes
    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n" + CYAN + "Choose a Pattern:" + RESET);
            System.out.println(" " + GREEN + "1." + RESET + "  Pattern 1");
            System.out.println(" " + GREEN + "2." + RESET + "  Pattern 2");
            System.out.println(" " + GREEN + "3." + RESET + "  Pattern 3");
            System.out.println(" " + GREEN + "4." + RESET + "  Pattern 4");
            System.out.println(" " + GREEN + "5." + RESET + "  Pattern 5");
            System.out.println(" " + GREEN + "6." + RESET + "  Pattern 6");
            System.out.println(" " + GREEN + "7." + RESET + "  Pattern 7");
            System.out.println(" " + GREEN + "8." + RESET + "  Pattern 8");
            System.out.println(" " + GREEN + "9." + RESET + "  Pattern 9");
            System.out.println(" " + GREEN + "10." + RESET + " Pattern 10");
            System.out.print("\n" + YELLOW + "Enter your choice: " + RESET);

            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    pattern1(); 
                    break;
                case 2:
                    pattern2(); 
                    break;
                case 3:
                    pattern3(); 
                    break;
                case 4: 
                    pattern4(); 
                    break;
                case 5: 
                    pattern5(); 
                    break;
                case 6: 
                    pattern6(); 
                    break;
                case 7: 
                    pattern7(); 
                    break;
                case 8:
                    pattern8(); 
                    break;
                case 9: 
                    pattern9(); 
                    break;
                case 10: 
                    pattern10(); 
                    break;
                default:
                    System.out.println(RED + "Invalid choice! Please enter a number between 1 and 10." + RESET);
            }

            System.out.print("\n" + PURPLE + "Do you want to continue? (Press 1 for Yes, any other number to exit): " + RESET);
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\n" + YELLOW + "Thank you! Program ended." + RESET);
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\n" + YELLOW + "Pattern 1:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int j = 1 ; j <= n+n-1 ; j++){
                System.out.print((j<=i || j>=(n+n-i)) ? RED + "X " + RESET : "  ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("\n" + BLUE + "Pattern 2:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++){
            int m = n-1;
            for(int j = i; j <= n+c; j++){
                System.out.print((j>n)? GREEN + m-- + " " + RESET : GREEN + j + " " + RESET);
            }
            c++;
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("\n" + CYAN + "Pattern 3:" + RESET + "\n");
        char c;
        for( int i=1; i<=5; i++){
            c = (i%2 == 0)? 'o' : 'x';
            for( int j=1; j<=5 ; j++){
                String color = (c == 'x') ? RED : BLUE;
                System.out.print(color + c + " " + RESET);
                c = (c == 'x') ? 'o' : 'x';
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\n" + PURPLE + "Pattern 4:" + RESET + "\n");
        char c;
        for(int i=1; i<=5; i++){
            c = (i%2 == 0)? 'O' : 'X';
            System.out.print(" ".repeat(5-i));
            for(int j=1; j<=i; j++){
                String color = (c == 'X') ? YELLOW : GREEN;
                System.out.print(color + c + " " + RESET);
                c = (c == 'X') ? 'O' : 'X';
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\n" + GREEN + "Pattern 5:" + RESET + "\n");
        for(int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(RED + "x " + RESET);
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("\n" + YELLOW + "Pattern 6:" + RESET + "\n");
        for(int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i==1 || i==5 || j==5 || j==1) ? BLUE + "x " + RESET : "  ");
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("\n" + CYAN + "Pattern 7:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+n-1;j++){
                System.out.print((j<=i)? RED + j + " " + RESET : (j>=n+n-i)? GREEN + ((n+n)-j) + " " + RESET : "  ");
            }
            System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("\n" + BLUE + "Pattern 8:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(((j==n-i+1) || (j==i) || (i==1) || (i==n)) ? YELLOW + "* " + RESET : "  ");
            }
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("\n" + PURPLE + "Pattern 9:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(CYAN + "* " + RESET);
            }
            System.out.println();
        }
    }

    static void pattern10() {
        System.out.println("\n" + RED + "Pattern 10:" + RESET + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -- ");
        int n = sc.nextInt();
        for(int i=n;i>=1;--i){
            for(int j=1;j<=i;j++){
                System.out.print(GREEN + "* " + RESET);
            }
            System.out.println();
        }
    }
}