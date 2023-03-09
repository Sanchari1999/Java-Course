import java.lang.*; //lang is a package - language package - gets imported by default, mandatory package.

package myfirst;

public class MyFirst { //Every java program is in the form of a class.
    //Class name should be same as file name

    public static void main(String[] args) { //The main function, like everything else in java, should be inside a class.
        //This is called a method, indtead of a function. 
        //Main method doesnot return anything, so it should always have a return typr "void".
        //Public: If you want anything from the class to be accesible outside, then it must be public. This method needs to be public because JVM will call the main method while executing the program. The main method is inside the class. JVM should be able to see the main method. 
        //Static: We cannot use a class unless we have created an object. If you want to use anything from a class without creating an object, then that should be declared static. JVM has to call main method which is inside this class without creating an object. 
        //When JVM is running, it will first call the "main" function. Just by using class name, it will call the function. 
        //If we do not write "static" JVM will not be able to find main method and give an error. 
        //String[] args: Command line argument. This is actually optional, whether you pass an argument or not. But it is a good practice to always write it. 
        //"String" here is a class.

       System.out.println("Hello World");
        //"println" is a method. 
        //In java, nothing is outside classes and objects. 
        //The "println" method is inside the object "out", which is inside a class called "System" - class name always starts with a capital letter.
        //A method should always have ().
    }
    
}
