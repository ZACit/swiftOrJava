package com.zachary.gq;

public class Main {

    public static void main(String[] args) {
     // This is a comment.
     /* Multi-line comment. */

        String thisString = "this is a string";
        System.out.println(thisString);
        System.out.println("another string");

        Integer thisInteger = 1234;
        System.out.println(thisInteger);
        int z = 1 + 2;
        System.out.println(z);





//
//        Week 9 Notes
//                ====================================================================
//* Java Primer
//
//        Notes:
//
//        - Try Java online:
//        https://www.compilejava.net/
//
//        - A Java program's entry point is inside the "main" function:
//        public static void main(String[] args) { ... }
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        let a: Int = 2 + 1 * 8
//        print(a)
//
//        Java:
//        int a = 2 + 1 * 8;
//        System.out.println(a);
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Type Inference
//
//        Swift:
//        let a: Int = 2
//        let b = a * 2
//
//        Java:
//        No type inference: all types must be declared.
//        int a = 2;
//        int b = a * 2;
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        let e: String = "Joe"
//
//        Java:
//        String e = "Joe";
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        let e: String = "Joe"
//        let f: String = e + " Doe"
//
//        Java:
//        String e = "Joe";
//        String f = e + "Doe";
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        Statically Typed language. Code is Type Checked / Compiled into Bytecode.
//
//                Java:
//        Statically Typed language. Code is Type Checked / Compiled into Bytecode.
//                -----------------------------------------------------------------------------------------------------------------------------
//* Functions as Values
//
//        Swift:
//        Functions are first-class values:
//
//        let blah = {
//                (n: Int) -> Int in
//        return 2 * n
//}
//        print(blah(13))
//
//        Java:
//        Functions aren't first-class! Can't assign blah function to a variable:
//
//        int blah(int n) {
//            return  2 * n;
//        }
//        System.out.println(blah(13));
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Function Types
//
//        Swift:
//        Has function types:
//        let blah: (Int) -> Int =  {
//                (n: Int) -> Int in
//        return 2 * n
//}
//
//        Java:
//        No function type. Input and output types show up only as part of function header:
//
//        output    input
//  /             /
//        int blah(int n) {
//            return  2 * n;
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Function Argument Labels
//
//        Swift:
//        Function arguments can have labels:
//
//        func fullName(first: String, last: String) -> String {
//            return first + " " + last
//        }
//        print(fullName(first: "Luke", last: "Pike"))
//
//        Java:
//        No argument labels. Only based on the order called:
//
//        String fullName(String first, String last) {
//            return first + " " + last;
//        }
//        System.out.println(fullName("Luke", "Pike"));
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        let a: Bool = 3 == 2 + 1
//
//        Java:
//        boolean a = 3 == 2 + 1;
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        true || false
//
//        Java:
//        true || false
//                -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        quadruple(n: 5) == 20 && 2 + 1 == 4
//
//        Java:
//        quadruple(5) == 20 && 2 + 1 == 4
//                -----------------------------------------------------------------------------------------------------------------------------
//* Void Type
//
//        Swift:
//        Void type: ()
//
//        Java:
//        Void type: void
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Void Value
//
//        Swift:
//        Void value: nil
//
//        Java:
//        Void value: null
//                -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        func sayHi() -> () {
//            print("hi")
//        }
//
//        Java:
//        void sayHi() {
//            System.out.println("hi");
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Primitive Types
//
//        Swift:
//        Int
//                Double
//        Float
//                Bool
//
//        Java:
//        int
//        double
//        float
//        boolean
//        long
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Condtional Statement
//
//        Swift:
//        if  x > 2 {
//
//        } else {
//
//        }
//
//        Java:
//        if  (x > 2) {
//
//        } else {
//
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Comments
//
//        Swift:
//// this is a line comment
///* this is
//a long comment */
//
//        Java:
//// this is a line comment
///* this is
//a long comment */
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Conditional Expression
//
//        Swift:
//        true ? 1 : 2
//
//        Java:
//        true ? 1 : 2
//                -----------------------------------------------------------------------------------------------------------------------------
//* Imperative/Sequential Language?
//
//                Swift:
//                Yes.
//                        var x = 1
//        x = x + 2
//
//        Java:
//        Yes.
//        int x = 1;
//        x = x + 2;
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Lists
//
//        Swift:
//        List Type
//[String]
//
//        Java:
//        Array Type
//        String[]
//
//        String[] is called an "Array" in Java:  similar to Lists in Swift, but they're fixed length
//                -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        let l = ["a", "bb"]
//
//        Java:
//        String[] l = new String[]{"a", "bb"};
//
//        or
//
//        String[] l = new String[2];
//        l[0] = "a";
//        l[1] = "bb";
//// You can't add more elements. It's fixed size!
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Java utility library: java.utils.ArrayList
//
//        More like Swift's List type...
//        More useful/flexible than Arrays...
//
//// importing the module:
//import java.utils.ArrayList;
//
//        ArrayList<String> l = new ArrayList<String>();
//        l.add("a");
//        l.add("bb");
//        System.out.println(l.size());
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Generic Types
//
//        Swift:
//[String]
//        Stack<Int>
//
//        Java:
//        ArrayList<String>
//        Stack<Integer> // note than a primitive type as argument to generic type needs to become its non-primitive equivalent: int ---> Integer
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Iterating over List Elements
//
//        Swift:
//        let l = ["a", "bb"]
//        var res = ""
//        for e in l {
//            res = res + ", " + e
//        }
//
//        Java:
//        ArrayList<String> l = new ArrayList<String>();
//        l.add("a");
//        l.add("bb");
//        String res = "";
//        for (String e: l) {
//            res = res + ", " + e
//        }
//
//        or C-language for-loop style:
//
//        for (int idx = 0; idx < l.size(); idx++) {
//            String e = l.get(idx);
//            // ...
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                Swift:
//        x += 12
//
//        Java:
//        x += 12;
//        y++; <--- same as y += 1
//        y--; <--- same as y -= 1
//                -----------------------------------------------------------------------------------------------------------------------------
//* List Count
//
//        Swift:
//        var l = [1,2]
//        print(l.count)
//
//        Java:
//        int[] l = new int[]{1, 2};
//        System.out.println(l.length);
//
//        or:
//
//        ArrayList<Integer> l = new ArrayList<Integer>();
//        l.add(1);
//        l.add(2);
//        System.out.println(l.size());
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Adding to List
//
//        Swift:
//        l.append("c");
//
//        Java:
//        l.add("c");
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Accessing Elements in List
//
//        Swift:
//        l[0]
//
//        Java:
//        l.get(0) <--- a list
//        a[0] 	    <--- an array
//                -----------------------------------------------------------------------------------------------------------------------------
//* Optional Types
//
//        Swift:
//        let s: String? = nil
//
//        Java:
//        No Optional Types: Just use "null" to represent nothing (default value for non-primitive types)
//        String s;
//        or
//        String s = null
//                -----------------------------------------------------------------------------------------------------------------------------
//* Dictionaries
//
//        Swift:
//        let shopping: [String: Float] = ["apple": 2.5, "cucumber": 1, "spinach": 1.5]
//        print(shopping["cucumber"])
//
//        Java:
//        Not supported as a special type: Use the java.utils.HashMap library class:
//
//        HashMap<String,Float> shopping = new HashMap<String,Float>();
//        shopping.put("apple", 2.5);
//        shopping.put("cucumber", 1);
//        shopping.put("spinach", 1.5);
//        System.out.println(shopping.get("cucumber"));
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Overloaded + Operator
//
//        Swift:
//        "+" operator doesn't convert automatically to match types...
//
//        let age = 12
//        print("I am " + String(age) + "years old")
//
//        Java:
//        "+" operator does convert automatically to match types...
//
//        Every value has an String toString() method which converts the value into a String.
//        The concatenation operator (+) implicitly calls that, so we can do (despite type mismatch):
//
//        int age = 12;
//        System.out.println("I am " + age + "years old");
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Iterating over Dictionary Elements
//
//        Swift:
//        for (produce,amount) in shopping {
//            print("We need " + String(amount) + "lb of " + produce + "s.")
//        }
//
//        Java:
//        for (String produce: shopping.keySet()) {
//            Float amount = shopping.get(produce);
//            System.out.println("We need " + amount + "lb of " + produce + "s.");
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Interfaces
//
//        Swift:
//        -- Protocols --
//
//        protocol Employee {
//            var name: String { get set }
//            var
//            id: Int { get }
//            func calcWagesForMonth() -> Float
//        }
//
//        Java:
//        -- Interfaces --
//// only functions go there:
//
//        interface Employee {
//            String getName();
//            void setName(String name);
//            int getId();
//            void setId(int id);
//            float calcWagesForMonth();
//        }
//
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Implicit "self" receiver
//
//        Swift:
//        self
//
//                Java
//        this
//                -----------------------------------------------------------------------------------------------------------------------------
//* Classes
//
//        Swift:
//
//        class SalaryEmployee: Employee {
//            var name: String
//            var id: Int
//            var monthlyPay: Float
//            init(name: String, id: Int, pay: Float) {
//                self.name = name
//                self.id = id
//                self.monthlyPay = pay
//            }
//            func calcWagesForMonth() -> Float {
//                return monthlyPay
//            }
//        }
//
//        Java:
//        class SalaryEmployee implements Employee {
//            String name;
//            int id;
//            float monthlyPay;
//            public SalaryEmployee(String name, int id, float pay) {
//                this.name = name;
//                this.id = id;
//                this.monthlyPay = pay;
//            }
//            public int getId() { return id; }
//            public void setId(int id) { this.id = id; }
//            public String getName() { return name; }
//            public void setName(String name) { this.name = name; }
//            public float calcWagesForMonth() {
//                return monthlyPay;
//            }
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Constructor
//
//        Swift:
//        clsss SalaryEmployee {
//      ...
//            init(name: String, id: Int, pay: Float) { ... }
//      ...
//        }
//
//        Java:
//        clsss SalaryEmployee {
//      ...
//      public SalaryEmployee(String name, int id, float pay) { ... }
//      ...
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Instantiating (Creating) an Object from a Class
//
//        Swift:
//        let sarah: SalaryEmployee  = SalaryEmployee(name: "Sarah Draft", id: 123343, pay: 2550)
//
//
//        Java:
//        SalaryEmployee sarah = new SalaryEmployee("Sarah Draft", 123343, 2550);
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Instance Variable/Property Access
//
//        Swift:
//        sarah.introduce()
//        sarah.name;
//
//        Java:
//        sarah.introduce();
//        sarah.name;
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Inheritance / Making a Sub-Class/Sub-Interface
//
//        Swift:
//        super
//
//        Java:
//        super
//
//        Swift:
//        class SchoolEmployee: SalaryEmployee {		// <------ SUBCLASS: SUPERCLASS
//            var isLicensed: Bool
//
//            init(name: String, id: Int, pay: Float, isLicensed: Bool) {
//                self.isLicensed = isLicensed
//                super.init(name: name, id: id, pay: pay)
//            }
//
//        }
//
//        Java:
//        class SchoolEmployee extends SalaryEmployee {		// <------ SUBCLASS: SUPERCLASS
//            boolean isLicensed;
//
//            public SchoolEmployee(String name, int id, float pay, boolean isLicensed) {
//                super(name, id, pay);
//                this.isLicensed = isLicensed;
//            }
//
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Universal Type
//
//        Swift:
//        Any
//
//        Java:
//        Object
//
//                * Notes:
//        - Swift's Any is a true universal type, it's a parent for even primitive types like Int, Bool, etc.
//                - In Java Object is only the top type for "Object" types, meaning non-primitive types (thus not including int, boolean, etc.)
//        - In Swift nil is not part of type Any
//        - In Java null is part of type Object
//                -----------------------------------------------------------------------------------------------------------------------------
//* Dynamic Dispatch
//
//        Swift:
//        Same.
//
//                Java:
//        Same.
//                -----------------------------------------------------------------------------------------------------------------------------
//* Importing Modules
//
//        Swift:
//import UserNotifications
//
//        Java:
//import java.utils.List;
//import java.utils.ArrayList;
//        -----------------------------------------------------------------------------------------------------------------------------
//                Java:
//        java.utils.List is an interface not a class (no implementation):
//
//        interface List<E> {
//            int size();
//            E get(int index);
//	  ...
//        }
//
//        java.utils.ArrayList is a class, implementing that interface:
//
//        class ArrayList<E> {
//      ...
//        }
//
//        Q. What's the use of having the interfaces, rather than just a class?
//        A. As part of the interface (protocol) we want to be able to interact with the object using some "messages" (functions, properties), but how they do what they do is implementation specific, and for different situations different implementations may be more efficient.
//
//        For example, ArrayList is typically used when we need a list, but there are are classes that also implement List interface: e.g. java.util.LinkedList. A Linked list is a list which is formed by each element maintaining a link to the next element:
//
//        0 -> 1 -> 2 -> 3
//
//        In this kind of lis its easy (fast) to remove an element. For example if we want to remove "2" then all we need to do is update "1"'s link to point to "3"...
//                -----------------------------------------------------------------------------------------------------------------------------
//* Access Levels
//
//        Swift:
//        open, internal, fileprivate, private
//
//        Java:
//        public, protected, private
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Static fields and functions
//
//        Swift:
//        class BankAccount {
//            static var bankName = "Wells Fargo"
//        }
//        print(BankAccount.bankName)
//
//        Java:
//        class BankAccount {
//            static String bankName = "Wells Fargo";
//        }
//        System.out.println(BankAccount.bankName);
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Equality for Primitive Types
//
//        Swift:
//        1 == 1
//        true == b
//        a == "hi"
//
//        Java:
//        1 == 1
//        true == b
//        a.equals("hi");		// <----- String type is non-primitive in Java!
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Equality for Object (Non-Primitive) Types
//
//        Swift:
//        Have to define your own:
//
//        class BankAccount {
//            var id: Int { get }
//            func equals(other: BankAccount) { return id == other.id }
//        }
//
//        Java:
//        Have to define your own:
//
//        class BankAccount {
//            int id;
//            boolean equals(BankAccount other) { return id == other.id; }
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Pointer Equality
//
//        Swift:
//        let a = BankAccount("foo", 100)
//        let b = a
//        a === b
//
//        Java:
//        a == b
//                -----------------------------------------------------------------------------------------------------------------------------
//* Call (Pass) by Reference
//
//        Swift:
//        Primitive types are passed by value.
//
//        let a = 12
//        foo(a)
//// at this point a cannot be affected (still 12)
//
//        Object types are passed by reference.
//
//        let a = BankAccount("foo", 100)
//        foo(a)
//// at this point a might be affected (function foo had access to a's fields and might have changed them!)
//
//        Java:
//        Primitive types are passed by value.
//
//        int a = 12;
//        foo(a)
//// at this point a cannot be affected (still 12)
//
//        Object types are passed by reference.
//
//        BankAccount a = BankAccount("foo", 100)
//        foo(a)
//// at this point a might be affected (function foo had access to a's fields and might have changed them!)
//                -----------------------------------------------------------------------------------------------------------------------------
//                Anonymous Functions
//
//        Swift:
//        Can pass functions as arguments to a function call:
//
//        func twice(fn: ((Int) -> Int), n: Int) -> Int { return fn(fn(n)) }
//        twice(fn: { (n: Int) -> Int in n * n }, n: 5)
//
//        Java:
//        Can't have functions as values. Solution: "Anonymous Classes"
//
//        interface FunctionIntToInt {
//            public int call(int n);
//        }
//
//        int twice(FunctionIntToInt f, int n) { return f.call(f.call(n)); }
//
//        twice(new FunctionIntToInt() {
//            public int call(int n) { return n * n; }
//        }, 5));
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Asynchronous Calls
//
//        Swift:
//        Can just provide a "callback" function as argument to an asynchronous call to run when results are ready...
//
//        getDataFromServer(onCompletion: {
//            (result) in
//            if result == nil {
//                // Call has failed... Decide what do do
//            } else {
//                // Call has succeeded... Get the data
//                self.stats = result.data
//            }
//        })
//
//
//        Java:
//        Can use the "anonymous class" trick above to do the same...
//
//        getDataFromServer(new onCompletionListener() {
//            public void onComplete(Object result) {
//      ...
//            }});
//        -----------------------------------------------------------------------------------------------------------------------------
//                * Exceptions
//
//        Swift:
//        do {
//            image = try loadImage(atPath: "./Resources/icon.jpg")
//
//        } catch {
//
//        }
//
//        Java:
//        try {
//            image = loadImage("./Resources/icon.jpg");
//
//        } catch (Exception e) {
//
//        }
//        -----------------------------------------------------------------------------------------------------------------------------
//                Q. How do we know which functions may raise exceptions?
//                A. Function marked with "throws" keyword:
//
//        Swift:
//        func someThrowingFunction() throws -> Int {
//            // ...
//        }
//
//        Java:
//        int someThrowingFunction() throws IOException {
//            // ...
//        }

    }
}
