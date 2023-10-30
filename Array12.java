/*
WAP to sort digit from each element
*/
import java.util.Arrays;
class Array12{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};
		for(int i=a.length-1; i>=0;i--){
			int n=a[i];
			int n1=n;
			int count =1;

			while(n1!=0){
				count++;
				n1/=10;
			}
			int arr[] = new int[count]; 
			for(int j=0; j<arr.length;j++){
				arr[j] = n%10;
				n/=10;
			}
			Arrays.sort(arr);
			for(int j=0; j<arr.length;j++){
				n= n*10+arr[j]; 
			}
			a[i] = n;
			
			
			
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
}
/*
 * Output:
 * 123 1289 478 355 2389 23458 12237 3589 2237 3567 1234 
 */