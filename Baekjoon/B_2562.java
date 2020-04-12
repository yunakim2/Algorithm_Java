import java.io.*;
import java.util.StringTokenizer;

public class B_2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n;
		int max =0;
		int k=0;
		for(int i =0; i<9; i++)
		{
			n = Integer.parseInt(bf.readLine());
			if(max<=n)
			{
				max = n;
				k = i;
			}
		}
		
		bw.write(max+"\n"+(k+1)+"\n");
		
		bw.close();

	}

}
