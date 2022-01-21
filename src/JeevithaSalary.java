import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JeevithaSalary {
    public static void main(String[] args) throws IOException {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int ss=0;
        int hr=0;
        int[] a=new int[7];
        for(int i=0;i<7;i++)
        {
            int k=Integer.parseInt(s.readLine());
            a[i]=k;
        }
        for(int j=0;j<7;j++)
        {
            if(j==0)
            {
                hr=hr+a[j];
                if(a[j]<=8){ss=ss+(a[j]*150);}
                else
                {
                    int nn=a[j]-8;
                    ss=ss+(a[j]*150);
                    ss=ss+nn*15;
                }
            }
            else if(j==6)
            {
                hr=hr+a[j];
                if(a[j]<=8){ss=ss+(a[j]*125);}
                else
                {
                    int nn=a[j]-8;
                    ss=ss+(a[j]*125);
                    ss=ss+nn*15;
                }

            }
            else
            {
                hr=hr+a[j];
                if(a[j]<=8){ss=ss+(a[j]*100);}
                else
                {
                    int nn=a[j]-8;
                    ss=ss+(a[j]*100);
                    ss=ss+nn*15;
                }
            }
        }
        if(hr>40)
        {
            int hhh=hr-40;
            ss=ss+(hhh*25);
        }
        System.out.println(ss);

    }

}