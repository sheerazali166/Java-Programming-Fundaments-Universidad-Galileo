package DataStructures.Practice_Of_Theory_Of_Array;

import java.util.Arrays;

public class Static {

    public static void main(String[] args) {

        int[] intArray = new int[3];
        System.out.println("Array of primitive int:");
        System.out.println(Arrays.toString(intArray));

        Integer[] integerArray = new Integer[3];
        System.out.println("\n\nArray of Integer Object:");
        System.out.println(Arrays.toString(integerArray));

        integerArray[0] = new Integer(5);
        System.out.println(Arrays.toString(integerArray));

        Foo fooArray[] = { new Foo(1), new Foo(2), new Foo(3)};
        System.out.println("\n\nArray Of Foo Object:");
        System.out.println(Arrays.toString(fooArray));

        System.out.println("Bravo");


    }
}

class Foo {

    private int id;

    public Foo(int _id) {
        this.id = _id;
    }

    //Execute, then Uncomment and execute again
    public String toString(){
        return "I'm Foo Object #" + this.id;
    }
}
