public class SampleCode {
    public static void main(String[] args) {
//         Assigning string value to a variable 'name'.
        String name = "dany";
        System.out.println(name);

//        Combining the string value with a word "Hello".
        System.out.println("Hello " + name);
        String firstName = "Hello ";
        String lastName = "World";
//        Combining two string values.
        String fullName = firstName + lastName;
//        Combining two strings with concat function.
        System.out.println(firstName.concat(lastName));
        System.out.println(fullName);


        int x = 15;
        int y = 10;
        int z = 20;
//         '+' is used to concat and addition.
//        Here we are using it for addition.
        System.out.println(x + y + z);

//        Assigning all the values in a single statement.
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        int l, m, n;
//        Assigning same value to different variables and adding them.
        l = m = n = 50;
        System.out.println(l + m + n);

//        Modifying and printing the value of a variable.
        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

//        Using final keyword and giving the value(we cant change the value).
        final int num = 25;
        System.out.println(num);

        float myFloatNum = 5.99f; // Floating point number
        System.out.println(myFloatNum);

        char myLetter = 'D';  // Character
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myLetter);

//        Boolean datatype
        boolean myBool = true;
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int k = 10;
        System.out.println(k == 10);      // Outputs true
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   //Outputs false
        System.out.println(myBool);        //Outputs true

        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 5000;
        System.out.println(myShort);

        long myLong = 15000000000L;
        System.out.println(myLong);

        double myDouble = 19.99d;
        System.out.println(myDouble);

//        Widening casting.
        int myInt = 9;
        double mDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(mDouble);    // Outputs 9.0

//        Narrowing casting.
        double nDouble = 9.78d;
        int mInt = (int) nDouble;
        System.out.println(nDouble);   // Outputs 9.78
        System.out.println(mInt);      //Outputs 9

//        Arithmetic operator.
        int sum1 = 100 + 50;        // 150 (100 + 50)
        System.out.println(sum1);
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        System.out.println(sum2);
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum3);

//        adding and then assigning the value to a variable.
        int s = 10;
        s += 5;
        System.out.println(s);

//        Comparison operator.
        int q = 5;
        int r = 3;
        System.out.println(q > r);

//        Assigning a string value, printing the length of the string, converting the string to upper case and lower case.
        String txt = "Hello World";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

//        Returns the position of the first occurrence of the text.
        String text = "She is working hard";
        System.out.println(text.indexOf("is"));

//        Addition of a string and integer, returns the output in string.
        String u = "10";
        String v = "20";
        int j = 20;
        System.out.println(u + j);
        System.out.println(u + v);

//        Special characters
        String tx = "It\'s alright\\ you will be \"ök\" now.";
        System.out.println(tx);

//        Math functions.
        System.out.println(Math.max(15, 10));
        System.out.println(Math.min(25, 20));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.abs(-3.7));
        System.out.println(Math.random() * 200);

//      if-else condition
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

//        Shorthand if-else
        int tym = 20;
        String result = (tym < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

//       Switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

//        Do-While loop.
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        for (int d = 0; d < 5; d++) {
            System.out.println(d);
        }

//        Break and continue
        int e = 0;
        while (e < 10) {
            System.out.println(e);
            e++;
            if (e == 6) {
                continue;
            }
            if (e == 8) {
                break;
            }
        }

//        Using for and for-each loop in arrays.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[1]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int f = 0; f < cars.length; f += 2) {
            System.out.println(cars[f]);
        }
        for (String f : cars) {
            System.out.println(f);
        }

//        Multidimensional array.
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int o = 0; o < myNumbers.length; ++o) {
            for (int h = 0; h < myNumbers[o].length; ++h) {
                System.out.println(myNumbers[o][h]);
            }
        }

//        calling the declared method which has no parameters passing through it.
        myMethod();

//        method with single parameter.
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

//        method with multiple parameters.
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);

//        Storing the result in a variable and printing the variable.
        int ab = myMethod(5, 3);
        System.out.println(ab);

//        Method with a value.
        checkAge(30);

//        Method Overloading
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

//        Recursion.
        int res = sum(10);
        System.out.println(res);

//    Creating object of a class
            SampleCode myObj = new SampleCode();
            myObj.bc = 20;   //modifying value of an attribute
            System.out.println(myObj.bc);

//     Accessing attributes
        System.out.println("Name: " + myObj.jname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }

    //    creating a method
    private static void myMethod() {
        System.out.println("I just got executed");
    }

    //    method with single parameter
    static void myMethod(String person) {
        System.out.println(person + " Refuses");
    }

    //     method with multiple parameters
    static void myMethod(String person, int age) {
        System.out.println(person + " is " + age);
    }

    //     Using return keyword inside the method
    static int myMethod(int x, int y) {
        return x + y;
    }


    //  Method with If-else
//    Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

//        If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

//            If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    //    Method Overloading.
//    passing different parameters with in the same method
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    //    Recursion:Function calls itself
//    Here sum() function is called
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
//      JAVA CLASSES
//    assigning value to attribute taken with by obj.
   int bc = 5;

//   Multiple attributes.
    String jname = "john";
    String lname = "doe";
    int age = 26;
}

