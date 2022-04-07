package comp3111.covid;

public class UnitTest {

	//static Case a = new Case();
	public static void main(String arg[]) {
		System.out.println("Hello, UnitTest!");	
	}
	
	public static int computeOne() {
		return 1;
	}
	
	public static boolean isItTrue() {
		return true;
	}
	
	public static boolean isEvenNumber(int num) {
		if ((num % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static int[] sort(int[] anyArray) {
		return new int[] {1, 2, 3, 4, 5};
	}
	
	/*public static String getIsoCode() {
		return a.getIsoCode();
	}*/
}
