import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    char passClass ;
    double bagWeight, excessesWeight=0;
    double charge=-1;
    int numberofpassinger, numberofgroups;

        System.out.println("The number of groups");
        numberofgroups = input.nextInt();
    for (int groupcounter=1; groupcounter<=numberofgroups; groupcounter++){

    System.out.println("Enter the number of passingers  for group number " +groupcounter);
    numberofpassinger = input.nextInt();
    for(int i=1;i<=numberofpassinger;i++){

        System.out.println("Enter the passingers class for passinger no" + i);
        passClass = input.next().charAt(0);
        System.out.println("Enter the bag weight ");
        bagWeight = input.nextDouble();

        switch (passClass) {
            case 'f':
            case 'F':
                if(bagWeight > 30){
                    excessesWeight = bagWeight - 30;
                    charge = excessesWeight * 10;
                }
                break;
            case 'b':
            case 'B' :
                if(bagWeight > 25){
                    excessesWeight = bagWeight - 25;
                    charge = excessesWeight * 10;
                }
                break;
            case 'e':
                case  'E' :
                    if(bagWeight > 20){
                        excessesWeight = bagWeight - 20;
                        charge = excessesWeight * 10;
                    }
                    break;
                    default:
                        System.out.println("Invalid  class");
        }
     System.out.println("You have to pay extra charge equal " + charge);
    }}}}