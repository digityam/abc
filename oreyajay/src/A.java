import java.net.*; 
import java.io.*; 
 
public class A { 
    public static void main(String[] args) throws Exception { 
    	 String urlString = "http://107.20.199.106/api/v3/sendsms/plain?user=ssdcichoda&password=rOBxH7ic&sender=SSDCIC&SMSText=hi&type=longsms&GSM=919949872257"; 
    	  URL oracle = new URL(urlString); 
    	        URLConnection yc = oracle.openConnection(); 
    	        BufferedReader in = new BufferedReader(new InputStreamReader( 
    	                                    yc.getInputStream())); 
    	        String inputLine; 
    	        while ((inputLine = in.readLine()) != null)  
    	            System.out.println(inputLine); 
    	        in.close(); 
    } 
}