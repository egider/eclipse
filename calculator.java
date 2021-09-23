package exercise;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);

System.out.println("Lutfen iki sayi giriniz.");
int a=input.nextInt();
int b=input.nextInt();

	System.out.println("Lutfen yapmak istediginiz islemi tuslayiniz.");
	System.out.println("\n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme");
	int islem=input.nextInt();
	switch(islem) {

	case 1:
		
		     System.out.println(a+b);
	
	case 2:
		   
		    	System.out.println(a-b);
		    
		    
	case 3: 	    
		
		    System.out.println(a*b);
		    
	    
	case 4:
		    if(b!=0) {
		   System.out.println(a/b);
		    } 
		   else
		    	System.out.println("belirsiz...");
	        }
	}
    }
