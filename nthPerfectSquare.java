public class nthPerfectSquare{
    public static void main(String args[]) {
        double count = 0;
	int last =83;
       	int i =0;
	while(true){
		int n = i, sum = 0;
       

            	if(Math.sqrt(n)%1==0){
			count = Math.sqrt(n);
		}
		if(count == last){
			System.out.println(last+"rd Perfect Square is: "+i);
			break;
		}
		i++;
	}
    }
}
/*
 * Output: 83rd Perfect Square is: 6889
 */
