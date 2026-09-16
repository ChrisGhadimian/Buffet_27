import java.util.Scanner

class LectureInput{
    public static void main(string args[]){
    System.oit.println("welcome to Chris's lemonade stand!");
    double item1price = 5.0;
    System.out.println("1. Grapes - " + item1price);
    double item2price = 3.50;
    System.out.println("2. Pink lemonade - " + item2price);
    double item3price = 2.50
    System.out.println("3. Lemonade - " + item3price);

    Scanner.sc = new Scanner(System.in);
    System.out.println("Who is purchasing?");
    String name = sc.nextLine();
    System.out.println("How many grapes would you like?");
    int item1Amt = sc.nextInt();
    System.out.println("how many pink lemonades do you want?");
    item2Amt = sc.nextInt();
    System.out.println("how many lemonades do you want?");
    int item3Amt = sc.nextInt();

    double item1Total = item1Price * item1Amt;
    double item2Total = item2Price * item2Amt;
    double item3Total = item3Price * item3Amt;
    System.out.println("Total is: " + (item1Total + item2Total + item3Total));
    System.out.println("Total is: " + grandTotal);

    System.out.println("How much would you like to tip?");
    double tip = sc.nextDouble();
    tip = (tip/100)*grandTotal;

    System.out.println("tip and Total is");

    }
}