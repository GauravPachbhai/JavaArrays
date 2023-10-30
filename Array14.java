/*
input :{15,16,21,28,18,9,42,35,24}
Consider White Number, Which is divisible by 4.
Consider black Number, Which is divisible by 7.
Consider grey Number, Which is both White & black.
replace White Number with -1.
replace black number with  -2.
replace grey number with -3.
*/
class Array14{
	public static void main(String args[]){
	
		int a[] = {15,16,21,28,14,24,18,9,42,35,41,35};
		for(int i=0; i<a.length;i++){
			
			if(a[i]%4==0 && a[i]%7==0){

				a[i] = -3;//Grey number

			}

			else if(a[i]%4==0){

				a[i] = -1;// White number

			}else if(a[i]%7==0){
				
				a[i]= -2;// Black number
			}
			
		}

		for(int i =0 ; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	
		
		
	}
}

/*
15 -1 -2 -3 -2 -1 18 9 -2 -2 41 -2
*/