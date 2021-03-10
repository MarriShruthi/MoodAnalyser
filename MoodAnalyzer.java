package practice;

import java.util.Scanner;

public class MoodAnalyzer {
	
	static String usermood;

	 public MoodAnalyzer(String usermood){
			// TODO Auto-generated constructor stub
			//super();
		 this.usermood=usermood;
		}
	 
	 

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     
		 MoodAnalyzer mood=new  MoodAnalyzer("i am in Happy mood");
        try {
       	 
        
		 if(mood.usermood.contains("i am in Happy mood"))
		 {
			 System.out.println("Happy");
		 }
		 else
		 {
			 System.out.println("Sad");
		 }
        }
        catch(NullPointerException e)
        {
       	 e.printStackTrace();
       	 System.out.println("it sad to be happy");
        }
	
	}

}
