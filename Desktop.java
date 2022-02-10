package week3.day1.system;

public class Desktop extends Computer {

	public void desktopSize() {

		System.out.println("Desktop Size -> Desktop ");

	}

	public static void main(String[] args) {

		Desktop specifications = new Desktop();
		specifications.desktopSize();
		specifications.computerModel();

	}
}
