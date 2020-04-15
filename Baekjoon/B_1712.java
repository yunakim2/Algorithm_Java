import java.io.*;
import java.util.StringTokenizer;

public class B_1712 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int n3 = Integer.parseInt(st.nextToken());
		
		if(n2>=n3) bw.write("-1"+"\n");
		else  bw.write(((n1/(n3-n2))+1)+"\n");
		
		bw.close();

	}
}

