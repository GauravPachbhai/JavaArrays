
/*
Armstrong no
*/
class ArmstrongNo{
	public static void main(String args[]){
	
		int n= 153, sum=0;
		int n1= n;
		int count =0;
		
		while(n1!=0){
			count++;
			n1/=10;
			
		}
		
		n1=n;
		while(n1!=0){
			sum+= Math.pow(n1%10, count);
			n1/=10;
		}

		if(sum == n)
			System.out.println(n+ " is a Armstrong" );
		else
			System.out.println(n+"no a Armstrong");

		
		
	}
}

/*
153 is a Armstrong
*/