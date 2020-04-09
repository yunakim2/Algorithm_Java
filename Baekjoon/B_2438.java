import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2438 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1 ; i<=n ; i++)
		{	
			for(int j =0 ; j<i ; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
