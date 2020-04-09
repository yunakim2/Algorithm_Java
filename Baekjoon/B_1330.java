import java.io.IOException;
import java.util.Scanner;
import java.io.*;


public class B_1330 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1>=n2)
		{	
			if(n1==n2)
			{
				bw.write("==");
			}
			else
			{
				bw.write(">");

			}
		}
		else
		{
			bw.write("<");
		}
		
		sc.close();
		bw.close();
		
	}

}
