import java.io.*;
import java.util.StringTokenizer;

public class B_5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		int cnt =0;
		for(int i = 0 ; i<s.length() ; i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='B' || s.charAt(i)=='C')
			{
				cnt= cnt+3;
			}
			else if(s.charAt(i)=='D' || s.charAt(i)=='E' || s.charAt(i)=='F')
			{
				cnt= cnt+4;
			}
			else if(s.charAt(i)=='G' || s.charAt(i)=='H' || s.charAt(i)=='I')
			{
				cnt= cnt+5;
			}
			else if(s.charAt(i)== 'J' || s.charAt(i)=='K' || s.charAt(i)=='L')
			{
				cnt= cnt+6;	
			}
			else if(s.charAt(i)=='M' || s.charAt(i)=='N' || s.charAt(i)=='O')
			{
				cnt= cnt+7;
			}
			else if(s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R' || s.charAt(i)=='S')
			{
				cnt= cnt+8;
			}
			else if(s.charAt(i)=='T' || s.charAt(i)=='U' || s.charAt(i)=='V')
			{
				cnt= cnt+9;
			}
			else if(s.charAt(i)=='W' || s.charAt(i)=='X' || s.charAt(i)=='Y'|| s.charAt(i)=='Z')
			{
				cnt= cnt+10;
			}
			else
			{
				cnt = cnt+2;
			}
			
		}
		bw.write(cnt+"\n");
		bw.close();

	}
}

