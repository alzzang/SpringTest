package calculator;


public class calImpl implements cal {
	
	@Override
	public double plus(double num1, double num2) {
		double sum = num1+num2;
		return sum;
	}

	@Override
	public double minus(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pow(double num1, double num2) {
		// TODO Auto-generated method stub
		double result=0;
		result=Math.pow(num1,num2);
		return result;
	}

	@Override
	public double sqrt(double num1) {		
		double result = Math.sqrt(num1);
		return result;
	}



}
