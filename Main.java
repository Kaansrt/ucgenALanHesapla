import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double u = (a+b+c)/2;
        double ucgenAlan;
        ucgenAlan = Math.sqrt( u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin alanı : " + ucgenAlan);

    }
}