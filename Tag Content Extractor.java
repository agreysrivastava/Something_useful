import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            String out="";
            boolean val=false;
            Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m=p.matcher(line);
            while(m.find()){
                out=m.group(2);
             //   System.out.println("Matched");
                System.out.println(out);
                val=true;
            }
            if(val==false)
                System.out.println("None");
          	//Write your code here
			
			testCases--;
		}
	}
}



