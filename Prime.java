import java.util.*;
import java.io.*;


public class Prime{

    public static void main(String[] aregs){


    Scanner in=new Scanner(System.in);

	System.out.print("Enter you Number ");
	int x=in.nextInt();
	int sum=0;
	
	for(int i=1; i<x;i++){
		System.out.println("");
			System.out.println(i+" Namota");
			for(int j=1 ; j<=10 ; j++){


					sum=i*j;
					System.out.println(i+ " X "+j+" = "+sum);


                                      }

		
                            }


             }


}