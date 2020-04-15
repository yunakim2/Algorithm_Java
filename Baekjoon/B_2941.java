import java.io.*;
import java.util.StringTokenizer;

public class B_2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String s = bf.readLine();
		String [] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i = 0 ; i< 8 ; i++)
		{
			s = s.replace(croatia[i],"a");
		}
		bw.write(s.length()+"\n");
		bw.close();

	}
}

