/*
WAP to Swap first and last element of array
*/
class Array3{
	public static void main(String args[]){
	
		int a[] = {10,20,30,40,50};
		int temp =a[0];
	
		a[0] = a[a.length-1] ;
		a[a.length-1] = temp;
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}
/*
Output:
50 20 30 40 10
*/