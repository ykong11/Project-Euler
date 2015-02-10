
public class ProjectEuler5 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, smallest;
		smallest=1;
		count=1;
		while (count<21){
			if (smallest%count==0) count=count+1;
			else {smallest=smallest+1;
				  count=1;
					}
		}
		System.out.println(smallest);
	}

}
