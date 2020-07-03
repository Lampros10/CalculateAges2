public class CalculateAges {

	public static void main (String [] args) {
		int CurrentYear = 2020;
		int MyAge = 26;
		int NikosAge = 12;
		int GeorgeAge = 52;
		int MariaAge = 72;
		int PastYear = 1960;
		int FutureYear = 2040;
		int[] arr = new int[4];
		arr[0] = MyAge;
		arr[1] = NikosAge;
		arr[2] = GeorgeAge;
		arr[3] = MariaAge;
		ArrayList<Integer> Years = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			System.out.println(CurrentYear - arr[i]);
			Years.add(CurrentYear - arr[i]);
		}
		
		for (int j = 0; j < 4; j++) {
			System.out.println(PastYear - Years.get(j));
		}

		for (int k = 0; k < 4; k++) {
			System.out.println(FutureYear - Years.get(k));
		}


}


}