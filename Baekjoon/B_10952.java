import java.io.*;
import java.util.StringTokenizer;

public class B_10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		while(n1!=0 && n2!=0)
		{
			bw.write((n1+n2)+"\n");
			
			StringTokenizer st2 = new StringTokenizer(bf.readLine());

			n1= Integer.parseInt(st2.nextToken());
			n2 = Integer.parseInt(st2.nextToken());
		}
		
		bw.close();

	}

}
