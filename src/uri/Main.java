package uri;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int N,A;
       float H, S;
       Scanner input = new Scanner(System.in);
        N = input.nextInt();
        A = input.nextInt();
        H = input.nextFloat();
        S = A*H;
        System.out.printf("NUMBER = %d\n",N);
        System.out.printf("SALARY = U$ %.2f\n",S);
    }
    }
