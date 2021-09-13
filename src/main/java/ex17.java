import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A,gender,W,H;
        double BAC,r;

        System.out.print("Enter 1 for male or 2 for female: ");
        gender = input.nextInt();   //stores gender
        if(gender ==1) {    //if gender is male
            r = 0.73;   //alcohol distribution ratio
            System.out.print("How many ounces of alcohol did you have? ");
            A = input.nextInt();    //stores total alcohol consumed
            System.out.print("What is your weight, in pounds? ");
            W=input.nextInt();  //stores weight
            System.out.print("How many hours has it been since your last drink? ");
            H = input.nextInt();    //stores hours since last drink
            BAC = A*5.14/W*r-0.015*H;   //calculates blood alcohol content
            System.out.println("Your BAC is "+BAC);
            if(BAC<=0.08) { //if BAC is less or equal to 0.08
                System.out.println("It is legal for you to drive");
            }else{  //if BAC is greater or equal to 0.08
                System.out.println("It is not legal for you to drive");
            }

        }else if (gender == 2) {    //if gender is female
            r = 0.66;   //alcohol distribution ratio
            System.out.print("How many ounces of alcohol did you have? ");
            A = input.nextInt();    //stores total alcohol consumed
            System.out.print("What is your weight, in pounds? ");
            W = input.nextInt();    //stores weight
            System.out.print("How many hours has it been since your last drink? ");
            H = input.nextInt();    //stores hours since last drink
            BAC = A * 5.14 / W * r - 0.015 * H; //calculates blood alcohol content
            System.out.println("Your BAC is " + BAC);
            if(BAC<=0.08) { //if BAC is less or equal to 0.08
                System.out.println("It is legal for you to drive");
            }else{  //if BAC is less or equal to 0.08
                System.out.println("It is not legal for you to drive");
            }
        }
    }
}
