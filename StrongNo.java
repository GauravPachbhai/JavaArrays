
/*
Strong no
*/
class StrongNo{
	public static void main(String args[]){
	
		int n= 145;
		int n1 = n;
		int mul = 1;
		int sum = 0;
		while(n!=0){
			mul = n%10;
			int temp =1;
			for(int i =mul ; i>0;i--){
				
				temp*=i; 
				mul = temp;
			}
			sum +=mul;
			n/=10;
		}
		if(sum == n1){
			System.out.println(n1+" is a Strong Number");
		}
		
		
	}
}

/*
145 is a Strong Number
*/