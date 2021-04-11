
public class Static_Method {
	import java.util.*;
	class IsStrictlyIncreasing
	{
	public static void main(String[] args) {
	Scanner scnr =new Scanner (System.in);
	double[] one = new double[4];
	  
	  
	System.out.println("Enter 4 numbers: ");
	for(int i=0; i<4; i++){
	one[i] = scnr.nextDouble();
	}
	if(isStrictlyIncreasing(one))
	System.out.println("The array is strictly increasing.");
	else
	System.out.println("The array is not strictly increasing.");
	}
	  
	public static boolean isStrictlyIncreasing(double[] in){
	for (int i=0; i<in.length-1; i++){
	if(in[i]>=in[i+1]){
	return false;
	}
	}
	return true;
	}
	}   
