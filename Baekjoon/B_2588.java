import java.io.*;


public class B_2588 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		
		bw.write(n1*(n2- (n2/10)*10)+"\n");
		bw.write(n1*(n2/10 - (n2/100)*10)+"\n");
		bw.write(n1*(n2/100)+"\n");
		bw.write(n1*n2+"\n");
		
		bw.close();

	}

}
