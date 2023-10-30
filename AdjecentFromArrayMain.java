import java.util.Arrays;
class AdjecentFromArray{

	int[] adjecentFromArray(int a[] ){
		int b[] = new int[a.length-1];
		for(int i=0; i<a.length-1;i++){
				b[i] = Math.abs(a[i] - a[i+1]);
		}
		return b;
	}
	
	int minAdjecentArray(int a[]){
		int sAd = a[0];
		for(int i=0; i<a.length; i++){
			if(sAd >a[i]){
				if(a[i] !=0)
					sAd = a[i];
			}
		}
		return sAd;
	}

	int[] nearAdjecent(int a[]){
		int b[] = Arrays.copyOf(a, a.length);
		Arrays.sort(a);
		int min = minAdjecentArray(adjecentFromArray(b)) ;
		for(int i=0; i<a.length-1; i++ ){
		 	if( min == Math.abs(b[i]- b[i+1]))
				System.out.println(b[i]+"\t"+b[i+1]);
		}
		return b;
	}

}
class AdjecentFromArrayMain{
	public static void main(String args[]){
		AdjecentFromArray obj = new AdjecentFromArray();
		
		int a[]={19,21, 1, 66,65, 88, 43,23 };

		obj.nearAdjecent(a);
	}
}