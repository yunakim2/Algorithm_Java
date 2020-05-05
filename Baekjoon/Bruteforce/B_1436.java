package Bruteforce;
import java.io.*;


public class B_1436 {

	static int N[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		N = new int [n];
		
		
		bw.write((movie(n))+"");
		bw.close();

	}
	
	static int movie(int n)
	{
		int c =666;
		int count =0;
		int num[] = new int [10001];
		while(count<n)
		{
			String s = String.valueOf(c);
			int len = s.length();
			for(int i =0 ; i<len ; i++)
			{
				if(s.charAt(i)=='6')
				{
					if(i+2<len)
					{
						if(s.charAt(i+1)=='6' && s.charAt(i+2)=='6')
						{
							if(count>0&&num[count-1] == Integer.parseInt(s)) continue;
							num[count++] = Integer.parseInt(s);
							
						}
					}
				}
			}
			
			c++;
			
		}
		return num[n-1];
	}

}
