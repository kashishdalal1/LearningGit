package Main;
import java.util.*;

public class k35 {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 20, 40, 20, 50};
        int res=0;
        int x = 20;
        for(int i = 0; i < a.length - 1; i++)
        {
            if (a[i] != x && a[i+1] !=x )
            {
                res=1;
            }
        }
        if(res==0)
        {
            System.out.println( String.valueOf(true));
        }
        else
        {
            System.out.println( String.valueOf(false));
        }
    }
}
