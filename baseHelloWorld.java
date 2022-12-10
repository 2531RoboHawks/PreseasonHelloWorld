// Create hello world program
//////////////////////////////////////////////////////////////////
//
//  Date Written: 12/10/2022    By: Joseph P. Merten
//  Going back to just a simple hello world for now...
//
//  JM-Change001 - adding a variable to use in the print statrment.
//  JM-Change002 - Add another variable
//
//////////////////////////////////////////////////////////////////
public class baseHelloWorld {
    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////
        //
        //  We need to define a variable to use.  The variable will hold the value
        //  we want to print.  When we define the variable, we need to tell java
        //  what type of variable we're defining so java knows what we can do with it.
        //  In this case we're defining a string variable.
        //
        //////////////////////////////////////////////////////////////////
        String myMessage = "Hello World";
        String mySpacer = "\n\n\n\n\n\n";
        System.out.println(mySpacer);
        System.out.println(myMessage);
        System.out.println(mySpacer);
    }
} 
