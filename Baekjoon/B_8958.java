import java.io.*;
import java.util.StringTokenizer;

public class B_8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		int yes ;
		int sum =0;
		for(int i = 0 ; i<n ; i++)
		{	String s = bf.readLine();
			sum =0;
			for(int j = 0 ; j<s.length(); j++)
			{
				yes =0;
				if(s.charAt(j)=='O') { 
					for(int k = j; k>=0; k--)
					{
						if(s.charAt(k)=='O') yes++;
						else break;
						
					}
					//bw.write("yes - "+yes+"\n");
				}
				else
				{
					yes =0;
				}
				sum = sum+yes;
				
			}
			bw.write(sum+"\n");
			
		}
		

			
		
		bw.close();

	}

}

