/*
WAP to Shift last digit to first from each element
*/
class Array10{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};

		for(int i=0; i<a.length;i++){
			int n=a[i];
			int count =1;
			int first = n/10;
			int last  = n%10;
			while(n!=0){
				
				n= n/10;
				count*=10;
				
			}
			count/=10;
			last = last*count + first;
			a[i] = last;
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}
/*
 * Output:
 * 312 9128 478 553 3928 83524 22173 5983 7232 3567 4213
 */