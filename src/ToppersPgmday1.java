import java.util.*;
public class ToppersPgmday1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no");
        int m=s.nextInt();
        int n= m;

        int ev=0,od=0;
        while (n> 0) {
            if ((n%10) % 2 == 0)
            {
                ev+= n % 10;
            }
            else
            {
                od += n % 10;
            }
            n /= 10;

        }
        if(ev==od){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}