import java.io.*;
import java.util.StringTokenizer;

public class B_1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		int cnt =n;
		for(int i=0 ;i<n; i++)
		{
			String s= bf.readLine();
			int alpha[] = new int[26];
			int j =0;
			int flag =0;
			while(j<s.length())
			{	
				int temp = s.charAt(j)-97;
				if(alpha[temp] ==0)
				{
					alpha[temp] = 1;
					flag = temp;
				}
				else
				{
					if(flag!=temp)
					{
						cnt--;
						break;
					}
					else
					{
						;
					}
				}
				j++;
			
			}
			
			
		}
		bw.write(cnt+"\n");
		
		bw.close();

	}
}

