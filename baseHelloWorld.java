// Create hello world program
//////////////////////////////////////////////////////////////////
//
//  Date Written: 12/10/2022    By: Joseph P. Merten
//  Going back to just a simple hello world for now...
//
//  JM-Change001 - adding a variable to use in the print statrment.
//  JM-Change002 - Add another variable.
//  JM-Change003 - Can we use numbers?
//  JM-Change004 - Happy Hlidays
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
        String myMessage = "Happy Holidays";
        String mySpacer = "\n\n\n\n\n\n";
        String myHMsg1 = "         |\n        -+-\n         A\n";
        String myHMsg2 = "        /=\\               /\\  /\\    ___  _ __  _ __ __    __\n";
        String myHMsg3 = "      i/ O \\i            /  \\/  \\  / _ \\| '__|| '__|\\ \\  / /\n";
        String myHMsg4 = "      /=====\\           / /\\  /\\ \\|  __/| |   | |    \\ \\/ /\n";
        String myHMsg5 = "      /  i  \\           \\ \\ \\/ / / \\___/|_|   |_|     \\  /\n";
        String myHMsg6 = "    i/ O * O \\i                                       / /\n";
        String myHMsg7 = "    /=========\\        __  __                        /_/    _\n";
        String myHMsg8 = "    /  *   *  \\        \\ \\/ /        /\\  /\\    __ _  ____  | |\n";
        String myHMsg9 = "  i/ O   i   O \\i       \\  /   __   /  \\/  \\  / _` |/ ___\\ |_|\n";
        String myHMsg10 = "  /=============\\       /  \\  |__| / /\\  /\\ \\| (_| |\\___ \\  _\n";
        String myHMsg11 = "  /  O   i   O  \\      /_/\\_\\      \\ \\ \\/ / / \\__,_|\\____/ |_|\n";
        String myHMsg12 = "i/ *   O   O   * \\i\n/=================\\\n       |___|";
        String myHMsg = myHMsg1 + myHMsg2 + myHMsg3 + myHMsg4 + myHMsg5 + myHMsg6 + myHMsg7 + myHMsg8 + 
            myHMsg9 + myHMsg10 + myHMsg11 + myHMsg12;
        System.out.println(mySpacer);
        System.out.println(myMessage);
        System.out.println(myHMsg);
        // System.out.println(mySpacer);
    }
} 
