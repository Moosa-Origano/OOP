import java.util.Arrays;


public class LearningStuff {
    static void myMethod() {
        System.out.println("My method testing!");
    }

    static void names(String name, int age) {
        System.out.println(name + " registered at " + age);
    }

    static int returningFunction(int x) {
        return 5+x;
    }

    // method overloading exists, so diff functions can have tge same name for different return types


    static int adding(int x, int y) {
        return x + y;
    }

    static double adding(double x, double y) {
        return x + y;
    }


    public static void main(String[] args) {

        myMethod();
        names("Moosa", 19);
        System.out.println(adding(5,7)); // function
        System.out.println(adding(5.35,7.67));



        System.out.println(returningFunction(10));

        // ---------------------- variables -----------------------------
        String name = "John ";
        int sum = 10;
        float myFloat = 5.2f;
        final double e = 2.7d; // for constants final is used
        char letter = 'a';
        boolean p = true;
        String name2 = "Jones";

        //        byte	Stores whole numbers from -128 to 127
        //        short	Stores whole numbers from -32,768 to 32,767
        //        int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        //        long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //        float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        //        double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        //        boolean	Stores true or false values
        //        char	Stores a single character/letter or ASCII values


        double d1 = 12E4d; // powers of 10

        System.out.println(name + name2); // Concatenation =  John Jones

        int de = 5, b = 6, c = 50; // multiple declarations in oneline
        int d, h, f;
        d = h = f = 50;

        // can use ASCII values for characters
        char A = 65;
        System.out.println(A); // A

        var x = 5; // var auto detects types

        // type casting
        int n1 = 10;
        System.out.println(((double) n1)); // 10.0

        ++n1; // adds 1

//        +=	x += 3	x = x + 3
//        -=	x -= 3	x = x - 3
//        *=	x *= 3	x = x * 3
//        /=	x /= 3	x = x / 3
//        %=	x %= 3	x = x % 3
//        &=	x &= 3	x = x & 3
//        |=	x |= 3	x = x | 3
//        ^=	x ^= 3	x = x ^ 3
//        >>=	x >>= 3	x = x >> 3
//        <<=	x <<= 3	x = x << 3

        System.out.println(name.length()); // 5

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        System.out.println(txt.charAt(0));  // P


        // ---------------------- VARIABLES -----------------------------

        // ---------------------- CONDITIONALS ----------------------------- //

        int age = 18;
        // IF ELSE
        if (age < 18) {
            System.out.println("Not old enough");
        } else if (age == 18) {
            System.out.println("Maybe old enough");
        } else {
            System.out.println("Old enough");
        }


        //  <3 TERNARY OPERATORS: variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        String result = (age < 18) ? "Not old enough " : "Old enough";

        // FOR LOOP
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        int dice = 1;

        // SWITCH STATEMENTS
        switch (dice) {
            case 1:
                System.out.println("L");
                break;
            case 6:
                System.out.println("W");
                break;
            default:
                System.out.println("Nothing");
        }

        // WHILE LOOP
        int j = 7;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        // DO WHILE
        boolean activation = false;
        do {
            activation  = true;
            System.out.println("System activation");
        }
        while (!activation);


        // ---------------------- CONDITIONALS ----------------------------- //


        // ---------------------- ARRAYS ----------------------------- //

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (String day : days) {
            if (day == "Sat") {
                break;
            } else if (day.equals("Wed")) {
                continue;
            }
            System.out.println(day);
        }

        int[] hunds = {100,200,300,400,500};

        System.out.println(hunds[0]);

        String[] books = new String[4]; // empty array with 4 spaces

        for (int i = 0; i < 4; i ++ ) {
            books[i] = "BOOK" + i;
        }

        System.out.println(Arrays.toString(books));



        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        for (String book : books) {
            System.out.println(book);
        }

        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        int[][] myMatrix = { {1,2,3} , {4,5,6} , {7,8,9}};

        for (int[] row : myMatrix) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        // ---------------------- ARRAYS ----------------------------- //
    }
}
