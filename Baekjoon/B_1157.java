import java.io.*;
import java.text.Format;
import java.util.StringTokenizer;

public class B_1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		int alpha [] = new int [26];
		int temp =0;
		int max =0;
		for(int i = 0 ; i<s.length() ; i++)
		{
			int c = s.charAt(i)-0;
			if(c>=97) { 
				c = c-32;
			}
			c = c- 65;
			alpha[c]++;
			
		}
		for(int i =0; i<alpha.length ; i++)
		{
			if(alpha[max]<= alpha[i])
			{
				max =i;
			}
		}
		for(int i =0 ; i<alpha.length ;i++)
		{
			if(alpha[max]==alpha[i]) {
				temp++;
				//bw.write(temp+"\n");
			}
		}
		if(temp>1) { bw.write("?"+"\n");
		}
		
		else{
			bw.write((char)(max+'A')+"\n");
			}
		
		bw.close();

	}
}

