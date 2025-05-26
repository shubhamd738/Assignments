package language.basics.Assignments;

public class Assignement_10 {

	public static void main(String[] args) {
		int[] value = { 12, 34, 52, 87, 1, 2, 30, 33 };

		for (int i = 0; i < value.length - 1; i++) {
			for (int j = i+1; j < value.length; j++) {
				if (value[i] < value[j]) {
					value[i] = value[i] + value[j]; // 12+34=46
					value[j] = value[i] - value[j]; // 46-34=12
					value[i] = value[i] - value[j]; // 46-12=34
				}
			}
		}
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
	}
}
