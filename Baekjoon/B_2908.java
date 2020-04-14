import java.io.*;
import java.util.StringTokenizer;

public class B_2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		String temp ="";
		String temp2 ="";
		for(int i = 2 ; i>=0 ; i--)
		{
			temp = temp+s1.charAt(i);
			temp2 = temp2+s2.charAt(i);
		}
		int n1 = Integer.parseInt(temp);
		int n2 = Integer.parseInt(temp2);
		if(n1>= n2) bw.write(n1+"\n");
		else bw.write(n2 +"\n");
		bw.close();

	}
}

