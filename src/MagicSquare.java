import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class MagicSquare
{
    static boolean isMagicSquare(int mat[][])
    {
        int N= mat.length;
        int sumd1 = 0;
        int sumd2=0;
        for (int i = 0; i < N; i++)
        {
            sumd1 += mat[i][i];
            sumd2 += mat[i][N-1-i];
        }
        if(sumd1!=sumd2)
            return false;

        for (int i = 0; i < N; i++) {

            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n");
        int n=Integer.parseInt(s.readLine());
        System.out.println("enter mat");
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            String[] rr;
            rr=s.readLine().split(" ");
            for(int k=0;k<n;k++)
            {
                mat[i][k]=Integer.parseInt(rr[k]);
            }
        }

        if (isMagicSquare(mat))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic"+" Square");
    }
}