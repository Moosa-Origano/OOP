public class Weekend {


    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a day of the week: ");
        String dayInput = System.console().readLine();

        System.out.println("Enter a day of the week");
        int moreDays = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < 7; i++) {
            if (days[i].equals(dayInput)) {
                System.out.println(days[(i + moreDays) % 7] );
            }
        }
    }
}
