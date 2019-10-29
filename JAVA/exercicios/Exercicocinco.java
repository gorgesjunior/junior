
import java.util.Scanner;
public class Exercicocinco

{
        public static void main (String[] args)

    {
        int a = 2;
        int b = 10;
        int c = 8;

        int deltaValue = (b * b) - (4 * a * c);

        double x = (-b + Math.sqrt(deltaValue))/(2 * a);
        double xLine = (-b - Math.sqrt(deltaValue))/(2 * a);

        System.out.println (" O valor de delta é :" + deltaValue);
        System.out.println ("O valor de x é :" + x);
        System.out.println (" O valor de x linha é : "+ xLine);

    }
}