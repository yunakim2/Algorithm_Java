import java.io.*;
import java.util.StringTokenizer;

public class B_10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = bf.readLine();
		int c [] = new int [26];
		for(int i = 0 ; i<c.length ; i++)
		{
			c[i]=-1;
		}
		for(int i =0 ;i<st.length(); i++)
		{
			int n = st.charAt(i)-97;
			if(c[n]== -1) c[n] =i;
			
		}
		for(int i = 0 ; i<c.length ; i++)
		{
			if(c[i]==-1) bw.write("-1");
			else {bw.write(c[i]+"");}
			
			bw.write(" ");
		}
		bw.write("\n");
		bw.close();

	}
}
