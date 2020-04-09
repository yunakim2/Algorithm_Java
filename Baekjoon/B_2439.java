import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int k = 1;
		for(int i = 1 ; i<=n ; i++)
		{	k = 1;
			for(int j = n-i ; j>0  ; j-- ) bw.write(" ");
			for(int j = 1; j<=i ; j++) bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
