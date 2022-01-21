import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MangoGarden {

    public static void main(String[] args) throws IOException {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n1=Integer.parseInt(s.readLine());
        int n2=Integer.parseInt(s.readLine());
        int r=Integer.parseInt(s.readLine());

        int mat[][]=new int[n1][n2];
        int c=0;
        int rrr=0;
        for(int i=0;i<n1;i++)
        {
            for(int k=0;k<n2;k++)
            {
                c=c+1;
                if(i==0 || k==0 || k==n2-1)
                {
                    mat[i][k]=0;
                    if(c==r)
                    {
                        rrr+=1;
                        System.out.println("yes");
                    }
                }
            }
        }
        if(rrr==0)
        {
            System.out.println("No");
        }
    }

}