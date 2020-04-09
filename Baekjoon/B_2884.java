import java.io.*;
import java.util.StringTokenizer;

public class B_2884 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		if(n1!=0)
		{
			if(n2>=45) bw.write(n1+" "+(n2-45));
			else bw.write((n1-1)+" "+((n2+60)-45));
		}
		else
		{
			if(n2>=45) bw.write(n1+" "+(n2-45));
			else bw.write("23 "+((n2+60)-45));
		}
		bw.close();

	}

}
