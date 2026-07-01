import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius : ");
        double c = sc.nextDouble();
        double f = (c* 9 / 5) + 32;
        System.out.println("Conversion of celsius to fahrenheit: "+f);
        System.out.println("Enter fahrenheit: ");
        double fe = sc.nextDouble();
        double ce = (fe-32)*5/9;
        System.out.println("After converting Fahrenheit into celsius: "+ce);
    }
}
