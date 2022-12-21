package functionalinterface;

public class LambdaPractice {

	public static void main(String[] args) {

		L l = s -> {
			String reversedStr = "";
			for (int i = s.length(); i > 0; i--) {
				reversedStr += s.charAt(i - 1);
			}
			System.out.println(reversedStr);
		};
		L l2 = s -> {
			String backFront = "";
			backFront = s.substring(s.length() / 2);
			backFront += s.substring(0, s.length() / 2);
			System.out.println(backFront);
		};

		l.rev("Navjot");
		l.rev("Singh");
		l2.rev("Navjot");
		l2.rev("Singh");
	}
}