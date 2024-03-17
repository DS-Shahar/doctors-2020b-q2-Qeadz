import java.util.*;
class Main {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
  public static void doctorRating(Doctor[] doctors) {
		for (int i = 0; i < doctors.length; i++) {
			double sum = 0;
			int count = 0;
			double rating;
			int input = reader.nextInt();
			while (input != -1) {
				input = reader.nextInt();
				sum += input;
				count++;
			}
			if (count > 0) {
				rating = sum / count;
				doctors[i].setRate(rating);
			}
		}

	}
}
