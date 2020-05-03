import java.security.*;
import java.io.*;

public class Sha {
    public static String sha(String ip) throws NoSuchAlgorithmException{
        
        MessageDigest md=MessageDigest.getInstance("Sha");
        StringBuffer sb=new StringBuffer();
        byte[] dig=md.digest(ip.getBytes());
        for(int i=0;i<dig.length;i++){
            sb.append(Integer.toString((dig[i]&0xff)+0x100,16).substring(1));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String inp=br.readLine();
        System.out.println("String: "+inp+"\nDigest: "+sha(inp));
    }
    
}
