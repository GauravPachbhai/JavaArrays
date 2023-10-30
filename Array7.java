/*
WAP to Swap the first and last inner digit of element of array  without using a temp variable
*/
class Array7{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

		for(int i=0; i<a.length;i++){
			int n=a[i];
			int x= n;
			int first=0;;
			int count =1;
			while(n!=0){
				first = n%10;
				n/=10;
				count*=10;
			}
	
			count/=10;
			x %= count;
			x *= 10;
			x+=first;
			
						
			a[i] = x;
			
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	
		
		
	}
}
/*
Input:
 123 1289 784 535 9283 35248 21732 9835 2327 5673 2134 
Output: 
231 2891 847 355 2839 52483 17322 8359 3272 6735 1342
 */