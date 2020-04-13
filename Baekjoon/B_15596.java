import java.io.*;

public class B_15596 {

	public static void main(String[] args) throws IOException {
	}
	long sum(int[] a) {
        long ans = 0;
        for(int i =0 ; i<a.length ; i++)
        {
            ans = ans+a[i];
        }
        return ans;
    }

}


