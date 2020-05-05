package Bruteforce;
import java.io.*;


public class B_2231 {

	static int N = 1000001;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int sum =bruteforce(n);
		
		bw.write(sum+"\n");
		bw.close();

	}
	static int bruteforce(int n)
	{
		for(int i = 1; i<N; i++)
		{
			if(sum(i)+i == n) return i;
		}
		return 0;
		
	}
	static int sum(int n)
	{
		int sum =0;
		int n1 = n;
		while(n1!=0)
		{
			sum+=n1%10;
			n1/=10;
		}
		return sum ;
		
	}
	

}
