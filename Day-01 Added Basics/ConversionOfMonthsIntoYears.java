import java.util.Scanner;

public class ConversionOfMonthsIntoYears {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of months: ");
        int months = sc.nextInt();
        int days = months*30;
        double no_ofyear = days/365;
        System.out.println("Days converted into Number of years is : "+no_ofyear);
        System.out.println("Enter days: ");
        int days1= sc.nextInt();
        int  months1 = days1/12;
        System.out.println("Days converted into number of months is:  "+months1);


    }
}
