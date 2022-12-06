import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        // System.out.printf("%(bogstav), data or arguments to be printet)
        // printf = method
        // "%(data bogstav)" = formattin string, must be enclosed with "" to work.
        // % sign = indicator to indicate it wants data to be written inside this string.
        // Conversion character after % = indicate what type of data it is, that is being printet.

        //Example: System.out,printf("%d", 10).

        conversionTypeCharacters();
        multipleStatements();

    }


    public static void conversionTypeCharacters() {

        Calendar calendar = Calendar.getInstance();

        System.out.printf("%d", 10);      //d stands for Integer.
        System.out.printf("\n");
        System.out.printf("%c", 'a');    //c stands for Character.
        System.out.printf("\n");
        System.out.printf("%C", 'a');     //C (uppercase) also stands for Character and will convert it to capital if it's not.
        System.out.printf("\n");
        System.out.printf("%s", "hello"); //s stands for String.
        System.out.printf("\n");
        System.out.printf("%S", "hello"); //S (Uppercase) also stands for String but will convert it to capital if it's not.
        System.out.printf("\n");
        System.out.printf("%b", 5 < 4);   //b stands for Boolean and will print out the result of the argument (false or true).
        System.out.printf("\n");
        System.out.printf("%B", 5 < 4);     //B (Uppercase) also stands for Boolean and will print out the result of the argument in capital letters.
        System.out.printf("\n");
        System.out.printf("%b", null);    //null will always return false.
        System.out.printf("\n");
        System.out.printf("%b", "Cow");   //Non-parsable Boolean arguments will always make it print its default which is true.
        System.out.printf("\n");
        System.out.printf("%f", 10.1);
        System.out.printf("\n");
        System.out.printf("%e", 10.123);   //e stands for scientific notation.
        System.out.printf("\n");
        System.out.printf("%E", 10.123);   //Same as e, but will make the letters in uppercase.
        System.out.printf("\n");
        System.out.printf("%g", 10000.0);  //print either scientific format or decimal, depending on how big the number is
        System.out.printf("\n");
        System.out.printf("%G", 10000.0);  //Does the same but prints letters in uppercase.
        System.out.printf("\n");
        System.out.printf("%o", 10);       //o stands for octal.
        System.out.printf("\n");
        System.out.printf("%x", 10);       //x stands for hexadecimal.
        System.out.printf("\n");
        System.out.printf("%X", 10);       //Same as before but makes letters uppercase.
        System.out.printf("\n");
        System.out.printf("%h", "hello");  //h stands for hashcode and prints its address in the memory.
        System.out.printf("\n");
        System.out.printf("%H", "hello");  //Does the same but makes the letters uppercase.
        System.out.printf("\n");
        System.out.printf("%a", 10.12);    //a stands for  hexadecimal decimal floating point values.
        System.out.printf("\n");
        System.out.printf("%A", 10.12);    //Does the same but makes the letters uppercase.
        System.out.printf("\n");
        System.out.printf("%tB", calendar);//t finds different times and day of the calendar. B finds out which month it is right now.
        System.out.printf("\n");
        System.out.printf("%TB", calendar);//Does the same, but makes the letters uppercase.
        //System.out.printf("%n");        //Makes a new line and therefor does not need any arguments.
        System.out.printf("\n");          //Does the same
        System.out.printf("%%");          //prints %. You need two, to make java understand it needs to print it, and not use it in formatting. We therefor dont need any arguments afterwards.

        int num1 = 10;
        int num2 = 30;

        //We write %d to indicate that it is an Integer we wanna souh to the terminal.
        //First %d refers to the first argument which is num1 that is our first variable that is an int.
        //Second %d refers to the second argument which is 20 and is also an int.
        //Last %d refers to the last argument which is num2 that is our second variable that is an int.
        //%n makes a new line.

        System.out.printf("%d%d%d%n", num1, 20, num2);    //Output will not make spaces between arguments, since the formatting string has no spaces between each format criteria.
        System.out.printf("%d %d %d %n", num1, 20, num2); //Output will have spaces between arguments since the formatting string has space.

        //Formatting string will therefore be used when deciding how the output will be written space wise.
        //You must correctly declare what type of data the formatting string and argument(s) is linked to, or it will throw a IllegalFormatConversionException error.
    }

    public static void multipleStatements() {

        int num = 87;
        char per = '%';
        String s = " of all statistics are made up?";

        //it will first print "did you know," since the formatting string with conversion characters first comes after. Both the String and formatting criteria is within the same " " citation marks
        //It will then do the same as the example above, where it will tie the first conversion character, to the first argument and so on.
        System.out.printf("Did you know, %d%c%s%n", num, per, s);

        //Since we can manually type % we don't need a variable for it. To print %, you can do this.
        //Instead of making it write the character using %c, we can instead type two %% in row, to make it type % when its printing.
        System.out.printf("Did you know, %d%%%s%n", num, s);

        //We want to avoid both using spaces in the variables we print and in the formatting string, since it then will make double spaces.
        //Here will print to many spaces because we both leave spaces in the formatting string, and the variables we declared above.
        System.out.printf("Did you know, %d %% %s %n", num, s);

        String name = "Sally";
        int age = 18;
        double gpa = 3.5;

        //System.out.printf("Name: %s%n Age: %d%n GPA: %f%n", name,age,gpa
        //Expected output (wrong).
        //Name: Sally
        // Age: 18
        // GPA: 3.5

        //Correct output
        System.out.printf("Name: %s%nAge: %d%nGPA: %f%n", name, age, gpa);
    }

    public static void precision(){

    }


}


