package CrashCourse;

public class CrashCourse {
    
    public static void main(String[] args) {

        // comments

        /* Multiline
            Comment
        */

        System.out.print("hello");
        System.out.println("World"); // auto prints on new line
        System.out.println("Hello World");

        // variable declarations:
        // PRIMITIVE VARIABLES
        int a; // integer
        double b; // decimal/float
        boolean c; // true or false

        a = 4;
        b = 5.5;
        c = false; // lowercase

        // arithmetic operations
        // + - / * %
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // increment and decrement by one:
        // -- ++
        d--;
        d++;
        d++;
        System.out.println("d is NOW equal to " + d);

        // COMPARISONS (always returns true or false)
        // <> <= >= == !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(7 != 2);

        // LOGICAL OPERATORS
        // In order of precedence: !(not) &&(and) ||(or)

        boolean e = false; boolean f = true;
        
        // predict output true or false?
        System.out.println(!e); // false
        System.out.println(e && f); // false
        System.out.println(e || f);  // true
        System.out.println(e || f && !e); // true

        System.out.println(e && f); // short circuits after checking e -- java does not need to check f


    }
    

}
