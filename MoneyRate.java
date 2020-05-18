package com.project.demoTest.unitTestExample;

public class MoneyRate {
	static int minMoney = 10;
	static int maxMoney = 100;
	static int minMonth = 1;
	static int maxMonth = 12;
	static boolean areValidValue(double a, double n){
			if (a < minMoney || a > maxMoney || n < minMonth || n > maxMonth){
			return false;
		}
		return true;
	}
	static String calculateMoneyRate(double a, double n){
		String str = "Input is not valid";
		if(areValidValue(a, n)){
			double s;
			int n1 = (int)n;
			if (n >= 1 && n < 3 ){
				s = (double)Math.round((a*(1+0.043*n1/12))*100)/100;
				str = "r = 4.3%; " + "S = " + Double.toString(s) + " mVNĐ";
				return str;
			}
			else if (n >= 3 && n < 6 ){
				s = (double)Math.round((a*(1+0.047*n1/12))*100)/100;
				str = "r = 4.7%; " + "S = " + Double.toString(s) + " mVNĐ";
				return str;
			}
			else if (n >= 6 && n < 9 ) {
				s = (double)Math.round((a*(1+0.051*n1/12))*100)/100;
				str = "r = 5.1%; " + "S = " + Double.toString(s) + " mVNĐ";
				return str;
			}
			else if (n >= 9 && n < 12 ) {
				s = (double)Math.round((a*(1+0.055*n1/12))*100)/100;
				str = "r = 5.5%; " + "S = " + Double.toString(s) + " mVNĐ";
				return str;
			}
			else {
				s = (double)Math.round((a*(1+0.058*n1/12))*100)/100;
				str = "r = 5.8%; " + "S = " + Double.toString(s) + " mVNĐ";
				return str;
			}
		}
		return str;
	}

}
