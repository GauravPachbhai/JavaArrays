public class nthPerfectcube{
    public static void main(String args[]) {
        double count = 0;
	int last =83;
       	int i =0;
	while(true){
		int n = i, sum = 0;
            	if(Math.cbrt(n)%1==0){
			count++;
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
 * Output: 83rd Perfect Square is: 551368
 */
