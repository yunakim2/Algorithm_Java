import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2108 {

	static int num [];
	static int c[] = new int[8001];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		num = new int[n];
		int sum =0;
		for(int i =0 ;i<n; i++)
		{
			num[i] = Integer.parseInt(bf.readLine());
			c[num[i]+4000]++;
			sum+= num[i];
		}
		Arrays.sort(num);
		bw.write((int)Math.round((double)sum/n)+"\n");
		bw.write(num[n/2]+"\n");
		bw.write(small()+"\n");
		bw.write(num[n-1]- num[0]+"\n");
		bw.close();

	}
	static int small() 
	{
		int index =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0 ; i<8001 ; i++)
		{
			if(c[index]<c[i]) {
				index = i;
				list.clear();
			}
			else if(c[i]!=0 &&c[i]==c[index])
			{
				list.add(i-4000);
			}
		}
		if(list.size()!=0)
		{
			return list.get(0);
		}
			return index-4000;
		
	}


}
