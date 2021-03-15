import java.util.Scanner;

public class PositionReversedStringArray extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int size = scanner.nextInt();

		String[] arrayElements = new String[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++)
			arrayElements[i] = scanner.next();

		System.out.println("Enter which element which element postion want:");
		String elementPostion = scanner.next();

		int result = getElementPosition(arrayElements, elementPostion);
		System.out.println(result);

		scanner.close();

	}
}

class UserMainCode {

	public static int getElementPosition(String[] arrayElements, String elementPostion) {

		for (int i = 0; i < arrayElements.length; i++) {

			for (int j = 0; j < arrayElements.length - 1; j++) {

				if (arrayElements[j].charAt(0) < arrayElements[j + 1].charAt(0)) {

					String swapElement = arrayElements[j];
					arrayElements[j] = arrayElements[j + 1];
					arrayElements[j + 1] = swapElement;

				}

			}

		}

		for (int i = 0; i < arrayElements.length; i++) {
			if (elementPostion.equals(arrayElements[i]))
				return i + 1;
		}

		return -1;

	}

}
