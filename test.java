import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        scanner.close();

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");

            Date date = inputFormat.parse(shortDate);
            String fullDate = outputFormat.format(date);

            System.out.println("Full Date: " + fullDate);
        } catch (Exception e) {
            System.out.println("Invalid Date! Please fill that again");
        }
    }
}
