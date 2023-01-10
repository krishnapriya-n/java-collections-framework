/**
 *Need of Java Collections Framework and why we use them
 *Notes are commented in the code
 *
 * Name : Krishna Priya Nimmagadda
 * Date : 10 Jan, 2023
 */

public class needOfCollections
{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        int e = 30;
        int f = 30;
        int g = 30;
        int h = 30;
        //this is how we save int variables individually
        //this is a complete waste of time and space and can be done faster
        
        int[] arArray = new int[10000]; //array of integers
        
        //main advantage of array is that we can store multiple values with a single variable
        //instead of creating separate variables like a, b, c... we can use an array
        
        //Array is index collection which holds homogeneous data elements
        
        /**
         * Limitations of array
         * 
         * 1. Arrays are fixed in size, not possible to change size of it later
         * 2. Array can hold only homogenous elements (only integers/ strings etc)
         * 3. Ready made APIs support is not available in array
         */ 
        // to overcome these limitations of array we have collections framework
        
        Student[] students = new Student [10];
        students[0] = new Student();
        students[1] = new Student();
        //students[2] = new Book(); //this gives type mismatch error as student is not book
        
        //Object class is super class of objects, it can hold different type of objects
        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book(); //it lets us add both student and book type
        // This solves the limitation of array holding only homogeneous elements
        
    }
}

class Book{
    //fake class to use 
}

class Student{
    //fake class to use
}
    
