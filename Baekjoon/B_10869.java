import java.io.*;
import java.util.StringTokenizer;


public class B_10869 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		bw.write(n1+n2+"\n");
		bw.write(n1-n2+"\n");
		bw.write(n1*n2+"\n");
		bw.write(n1/n2+"\n");
		bw.write(n1%n2+"\n");

		bw.close();

	}

}
