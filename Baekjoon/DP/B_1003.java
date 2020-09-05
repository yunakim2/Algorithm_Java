import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1003 {


	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		
		for(int i =0 ; i<num ; i++) {
			int n = Integer.parseInt(bf.readLine());
			bw.write(fibo(n)+" "+fibo(n+1)+"\n");
			
		}
		bw.close();

	}
	public static int fibo(int n) {
		if(n==0) return 1;
		if(n==1) return 0;
		int a =1;
		int b = 0;
		int c =1;
		
		for (int i = 0 ; i<n-2 ; i++) {
			a = b;
			b = c;
			c = a+b;
		}
		return c;
	}

}
