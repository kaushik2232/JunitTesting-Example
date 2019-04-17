package Testing;

public class JunitTesting {

	public double BMI(double height, double weight) {
		return weight/(height * height);
	}
	
	public int countS(String word) {
		int count = 0;
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)=='s' || word.charAt(i)=='S') {
				count++;
			}
		}
		return count;
	}
}
