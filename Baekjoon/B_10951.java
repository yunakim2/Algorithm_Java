import java.io.*;
import java.util.StringTokenizer;

public class B_10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		if(s == null) return;
		StringTokenizer st = new StringTokenizer(s);
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		while(true)
		{
			bw.write((n1+n2)+"\n");	
			s= bf.readLine();
			if(s==null) {break;}
		
			StringTokenizer st2 = new StringTokenizer(s);

			n1= Integer.parseInt(st2.nextToken());
			n2 = Integer.parseInt(st2.nextToken());
		}
		
		bw.close();

	}

}
