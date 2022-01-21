import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MinMaxRange {
    public static void main(String[] args) throws IOException {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n=Integer.parseInt(s.readLine());

        int maxx=0;
        int minn=9999;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            int k=Integer.parseInt(s.readLine());
            a[i]=k;
            if(k>maxx){maxx=k;}
            if(k<minn){minn=k;}
        }
        int res=maxx-minn;
        System.out.println(res);

    }

}