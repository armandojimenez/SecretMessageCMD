import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {

		// ask the user for message to encode or decode
		String codeAgain = "";

		do {
			System.out.println("Enter a message to encode or decode");

			Scanner scan = new Scanner(System.in);

			String message = scan.nextLine();
			String out = "";

			System.out.println("Enter a secret key(-26 to 26): ");

			try {

				int intKey = Integer.parseInt(scan.nextLine());

				char key = (char) intKey;

				for (int x = 0; x < message.length(); x++) {

					char in = message.charAt(x);

					if (in >= 'A' && in <= 'Z') {

						in += key;
						if (in > 'Z')
							in -= 26;
						if (in < 'A')
							in += 26;

					}

					if (in >= 'a' && in <= 'z') {

						in += key;
						if (in > 'z')
							in -= 26;
						if (in < 'a')
							in += 26;

					}

					out += in;

				}

				System.out.println();
				System.out.println(out);

				System.out.println("Want to encode/decode another message? (y/n)");

				codeAgain = scan.next();

			} catch (Exception e) {
				System.out.println("Please enter a number between -26 and 26.");
			}

		} while (codeAgain.equalsIgnoreCase("y"));

	}
}
