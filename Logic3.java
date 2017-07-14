package rsttst;
import java.util.Scanner;
public class Logic3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ip1=s.next();
		char last=ip1.charAt(ip1.length()-1);
	int key=ip1.indexOf(last);
	String alphabet="abcdefghijklmnopqrstuvwxyz";
	String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	for(int i=0;i<ip1.length();i++){
		char ch=ip1.charAt(i);
	
		if(ch>='a' &&ch<='z'){
			int input1=(alphabet.indexOf(ch)+1);
			int c2=input1-key;
			System.out.println(c2);
	}
			else{
				int input2=( ALPHABET.indexOf(ch)+1);
				int c2=input2-key;
				System.out.println(c2);
		}
		
		
	}
			}
		
	}
			
