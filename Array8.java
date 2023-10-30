/*
WAP to reverse the inner digit of element of array without using a temp variable
*/
class Array8{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134,1};

		for(int i=0; i<a.length;i++){
			int n=a[i];
			int x =0;
			while(n!=0){
				x = (x*10) + n%10;
				n/=10;
			}
			a[i] = x;
			
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
}
/*
 * Output:
 * 321 9821 487 535 3829 84253 23712 5389 7232 3765 4312 1
 */