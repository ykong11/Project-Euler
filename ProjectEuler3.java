
public class ProjectEuler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num,prime,largest;
		num=600851475143l;
		prime=2;
		largest=0;
		while(num>1){
			if(num%prime==0){
				if (largest<prime)largest=prime;
				num=num/prime;
				prime=2;
			}
			else prime=prime+1;
		}
		System.out.println(largest);
	}

}
