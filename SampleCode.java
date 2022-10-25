//   packages
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.*;

public class SampleCode {

//    Constructor

    public SampleCode() {
    }

    int personAge;
    String personName;

    public void main(String[] args) {
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

//        Call the static method
        myStaticMethod();

//        Create an object of class to call the public method.
        SampleCode mObj = new SampleCode();
        mObj.myPublicMethod(); // Call the public method on the object

//        Calling Constructor
        SampleCode sobj = new SampleCode();
        System.out.println(sobj.personName + " " + sobj.personAge);

        Student nObj = new Student();
        nObj.study(); // call abstract method

//        Encapsulation
//        Get and Set methods
        SampleCode sObj = new SampleCode();
        sObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(sObj.getName());

//        Inheritance
        // Create a myCar object
        Car myCar = new Car();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(" " + myCar.modelName);

//       Polymorphism (many forms)
        SampleCode myAnimal = new SampleCode();  // Create a Animal object
        SampleCode myPig = new Pig();  // Create a Pig object
        SampleCode myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

//        Multiple Interfaces
        DemoClass iObj = new DemoClass();
        iObj.myMethod();
        iObj.myOtherMethod();

//        enum
        Level myVar = Level.LOW;
        System.out.println(myVar);

//        Java user input
        Scanner uObj = new Scanner(System.in);  // Create a Scanner object
        String userName = uObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

//        Java date
        LocalDate dateObj = LocalDate.now(); // Create a date object
        System.out.println(dateObj); // Display the current date

//        Java time
        LocalTime timeObj = LocalTime.now();
        System.out.println(timeObj);

//        Java ArrayList
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");
        System.out.println(car);
        System.out.println(car.get(0));
        System.out.println(car.set(0, "Opel"));
        System.out.println(car.remove(0));
        System.out.println(car.size());
        for (int f = 0; f < car.size(); f++) {
            System.out.println(car.get(f));
        }

//        Java linkedList
        LinkedList<String> carss = new LinkedList<String>();
        carss.add("Volvo");
        carss.add("BMW");
        carss.add("Ford");
        carss.add("Mazda");
        System.out.println(carss);

//        HashMap
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

//        HashSet
        HashSet<String> bikes = new HashSet<String>();
        bikes.add("Zeus");
        bikes.add("Flash");
        bikes.add("Satan");
        bikes.add("Flash");
        bikes.add("Aero");
        System.out.println(bikes);

//        Iterators
//         Get the iterator
        Iterator<String> it = Arrays.stream(cars).iterator();

        // Print the first item
        System.out.println(it.next());

//        Wrapper classes (Using wrapper class instead of primitive data type)
        Integer Int = 5;
        Double Double = 5.99;
        Character myChar = 'A';
        System.out.println(Int);
        System.out.println(Double);
        System.out.println(myChar);

//        Exceptions (try and catch)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception ae) {
            System.out.println("Something went wrong.");
        }

//        Regular Expressions
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

//        Threads
        SampleCode obj = new SampleCode();
        Thread thread = new Thread((Runnable) obj);
        thread.start();
        System.out.println("This code is outside of the thread");

//        Java Lambda
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (w) -> { System.out.println(w); } );
    }

//    creating a method
    private static void myMethod() {
        System.out.println("I just got executed");
    }

    //        method with single parameter
    static void myMethod(String person) {
        System.out.println(person + " Refuses");
    }

    //         method with multiple parameters
    static void myMethod(String person, int age) {
        System.out.println(person + " is " + age);
    }

    //         Using return keyword inside the method
    static int myMethod(int x, int y) {
        return x + y;
    }


    //      Method with If-else
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

    //        Recursion:Function calls itself
//    Here sum() function is called
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }

    //         JAVA CLASSES
//    assigning value to attribute taken with by obj.
    int bc = 5;

    //   Multiple attributes.
    String jname = "john";
    String lname = "doe";
    int age = 26;

    //    Static method
    private static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //    Public method
//    To access a public method , object should be created.
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //    public abstract void study(); unable to create a abstract class
//    Subclass (inherit from SampleCode)
    static class Student extends SampleCode {
        public int graduationYear = 2018;

        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }

    //    Getter and setter
    private String name;

    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    //     Inheritance
    static class Car extends SampleCode {
        private String modelName = "Mustang";
    }

    //    Polymorphism
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}class Pig extends SampleCode {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }class Dog extends SampleCode {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

//    Interfaces
interface FirstInterface {
   public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

//  Enum(represents a group of constants like final)
enum Level {
    LOW,
    MEDIUM,
    HIGH
}




