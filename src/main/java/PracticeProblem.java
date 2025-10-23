public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int towerOfHanoi(int num) {
		//Base Case:
		if (num < 3) {
			return -1;
		}
		if (num == 3) {
			return 7;
		}
		//Recursion Case:
		return 2 * towerOfHanoi(num - 1) + 1;
	}
}
