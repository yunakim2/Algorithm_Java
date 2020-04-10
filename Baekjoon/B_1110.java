import java.io.*;
import java.util.StringTokenizer;

public class B_1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int n1 ;
		int n2 ;
		if(n>=10)
		{
			n1 = n/10;
			n2 = n%10;
		}
		else
		{
			n1 = 0;
			n2 = n;
		}
	
		int num  =0;
		int count = 0 ;
		
		while(true)
		{
			count++;
			num = n1+n2;
			if(num<10)
			{
				n1 = n2;
				n2 = num;
			}
			else
			{
				n1 = n2;
				n2 = num%10;
				
			}
			
			if((n1*10 + n2) == n ) break;
			
		}
		bw.write(count+"\n");
		
		bw.close();

	}

}
