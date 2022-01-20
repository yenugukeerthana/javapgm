import java.util.Scanner;

public class LabsAllocationThree {

            public static void main(String[] args) {

                int x,y,z,n,res;

                Scanner s=new Scanner(System.in);

                System.out.println("enter x");

                x=s.nextInt();

                System.out.println("enter y");

                y=s.nextInt();

                System.out.println("enter z");

                z=s.nextInt();

                System.out.println("enter n");

                n=s.nextInt();

                int r1=x-n;

                int r2=y-n;

                int r3=z-n;


                if(r1>0 && (r1 <r2 && r1<r3))

                {System.out.println("L1");}

                else if(r2>0 && (r2 <r1 && r2<r3))

                {System.out.println("L2");}

                else

                {System.out.println("L3");}

            }
        }