package Testing;

public class JunitTesting {

	public int cube(int x) {
		return x * x * x;
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
