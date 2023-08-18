import java.util.Scanner;

//Can converts from Hex to Dec
public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert from base ");
        int base1 = sc.nextInt();
        System.out.println("To base ");
        int base2 = sc.nextInt();
        System.out.println("The number: ");
        String strx = sc.next();
        sc.close();

        System.out.println(toBaseY(base2, toBase10(base1, strx), ""));
    }

    public static int toBase10(int base, String xS) {
        if (base == 10) {
            return Integer.parseInt(xS);
        }
        if (base == 11) {
            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(11, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(11, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(11, len);
                        len--;
                        break;
                }
            }
            return decimal;
        }
        if (base == 12) {

            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(12, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(12, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(12, len);
                        len--;
                        break;
                    case 'c':
                    case 'C':
                        decimal = decimal + 12 * (int) Math.pow(12, len);
                        len--;
                        break;
                }
            }
            return decimal;
        }
        if (base == 13) {

            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(13, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(13, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(13, len);
                        len--;
                        break;
                    case 'c':
                    case 'C':
                        decimal = decimal + 12 * (int) Math.pow(13, len);
                        len--;
                        break;
                    case 'd':
                    case 'D':
                        decimal = decimal + 13 * (int) Math.pow(13, len);
                        len--;
                        break;
                }
            }
            return decimal;
        }
        if (base == 14) {

            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(14, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(14, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(14, len);
                        len--;
                        break;
                    case 'c':
                    case 'C':
                        decimal = decimal + 12 * (int) Math.pow(14, len);
                        len--;
                        break;
                    case 'd':
                    case 'D':
                        decimal = decimal + 13 * (int) Math.pow(14, len);
                        len--;
                        break;
                    case 'e':
                    case 'E':
                        decimal = decimal + 14 * (int) Math.pow(14, len);
                        len--;
                        break;
                }
            }
            return decimal;
        }
        if (base == 15) {

            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'c':
                    case 'C':
                        decimal = decimal + 12 * (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'd':
                    case 'D':
                        decimal = decimal + 13 * (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'e':
                    case 'E':
                        decimal = decimal + 14 * (int) Math.pow(15, len);
                        len--;
                        break;
                    case 'f':
                    case 'F':
                        decimal = decimal + 15 * (int) Math.pow(15, len);
                        len--;
                        break;
                }
            }
            return decimal;
        }
        if (base == 16) {
            int decimal = 0;
            int len = xS.length() - 1;
            for (int a = 0; a < xS.length(); a++) {
                char ch = xS.charAt(a);
                switch (ch) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        decimal = decimal + Integer.parseInt(Character.toString(ch)) *
                                (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'a':
                    case 'A':
                        decimal = decimal + 10 * (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'b':
                    case 'B':
                        decimal = decimal + 11 * (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'c':
                    case 'C':
                        decimal = decimal + 12 * (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'd':
                    case 'D':
                        decimal = decimal + 13 * (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'e':
                    case 'E':
                        decimal = decimal + 14 * (int) Math.pow(16, len);
                        len--;
                        break;
                    case 'f':
                    case 'F':
                        decimal = decimal + 15 * (int) Math.pow(16, len);
                        len--;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
            return decimal;
        }
        int x = Integer.parseInt(xS);
        String strx = Integer.toString(x);
        String strxRev = new StringBuilder(strx).reverse().toString();
        int maxPow = (strx.length()) - 1;

        int res = 0;
        for (int p = maxPow; p >= 0; p--) {
            res += Character.getNumericValue(strxRev.charAt(p)) * Math.pow(base, p);
        }
        return res;
    }

    public static String toBaseY(int base, int num, String res) {
        if (base == 16) {
            return toHex(num);
        }

        if (num == 0) // base case
            return new StringBuilder(res).reverse().toString();

        else {
            res += Integer.toString(num % base);
            return toBaseY(base, num / base, res);
        }
    }

    public static String toBase11(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A' };
        while (decimal > 0) {
            rem = decimal % 11;
            hex = hexchars[rem] + hex;
            decimal = decimal / 11;
        }
        return hex;
    }

    public static String toBase12(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B' };
        while (decimal > 0) {
            rem = decimal % 12;
            hex = hexchars[rem] + hex;
            decimal = decimal / 12;
        }
        return hex;
    }

    public static String toBase13(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C' };
        while (decimal > 0) {
            rem = decimal % 13;
            hex = hexchars[rem] + hex;
            decimal = decimal / 13;
        }
        return hex;
    }

    public static String toBase14(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D' };
        while (decimal > 0) {
            rem = decimal % 14;
            hex = hexchars[rem] + hex;
            decimal = decimal / 14;
        }
        return hex;
    }

    public static String toBase15(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E' };
        while (decimal > 0) {
            rem = decimal % 15;
            hex = hexchars[rem] + hex;
            decimal = decimal / 15;
        }
        return hex;
    }

    public static String toHex(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (decimal > 0) {
            rem = decimal % 16;
            hex = hexchars[rem] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
}
