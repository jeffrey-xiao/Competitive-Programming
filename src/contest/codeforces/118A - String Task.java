import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef{
    
	public static void main (String[] args) throws java.lang.Exception{
	    
        Scanner scan = new Scanner(System.in);
        
    	String s = scan.next().toLowerCase();
    	char c = '0';
    	String ans = "";
    	
    	for(int x = 0; x < s.length(); x++){
        	c = s.charAt(x);
        	if(!(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='y'))
                ans = ans + "." + c;
    	}
        
        System.out.print(ans);
	}
}
