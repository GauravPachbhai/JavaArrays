/*
input :{15,16,21,28,18,9,42,35,24}
Consider White Number, Which is divisible by 4.
Consider black Number, Which contain last digit as 4
Consider grey Number, Which is both White & black.
replace White Number with -1.
replace black number with  -2.
replace grey number with -3.
*/
class Array15{
	public static void main(String args[]){
	
		int a[] = {15,16,21,28,14,24,18,9,42,35,41,35,24};
		for(int i=0; i<a.length;i++){
			int n  = a[i]%10;

			if(a[i] %4==0){
				if(n==4)
					a[i]=-3;// number is grey.
				else
					a[i] = -1; // number is white.
			}
			else{
				if(n==4)
					a[i] = -2; //black numer.
			}
			
		}

		for(int i =0 ; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	
		
		
	}
}

/*
15 -1 21 -1 -2 -3 18 9 42 35 41 35 -3
*/