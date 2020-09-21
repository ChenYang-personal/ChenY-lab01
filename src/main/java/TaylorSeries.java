public class TaylorSeries {
	public int num;
	public int n;
    
	static int factorial(int num) {
		if(num >=1) {
			int result = num*factorial(num - 1);
			return result;
		}
		return 1;
	}
	
	static int pow(int n,int num) {
		int result;
		if (num >= 1) {
			result = n*pow(n,num-1);
			return result;
		}
		return 1;
	}
	static float approximateExp(int n,int num){
		int i = 0;
		float target = 0;
		float temp;
		while(i<=num) {
			float a1 = pow(n,i);
			float a2 = factorial(i);
			temp = a1/a2;
			target = target + temp;
			i++;
		}
		return target;
	}

}