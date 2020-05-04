import java.math.*;
import java.util.*;
import java.security.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class SHA256{
  public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String inp=sc.nextLine();
        try{
            MessageDigest md= MessageDigest.getInstance("SHA-256");
            byte[] digest=md.digest(inp.getBytes(StandardCharsets.UTF_8));
            BigInteger num=new BigInteger(1,digest);
            String str= num.toString(16);
            while(str.length()<32){
                str='0'+str;
            }
            System.out.println(str+str.length());
        }
        catch(Exception e){

        }
    }
}
