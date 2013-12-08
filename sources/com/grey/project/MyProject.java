package com.grey.project;

/**
 * The class <code>MyProject</code> is a main
 * class in the project that intended to learn
 * the Java language.
 */
public class MyProject {
    public static void main(String[] args) {
        new MyProject().printProjectInfo(true);
    }

    /**
     * Prints the infomation about the MyProject class.
     * @param fullInfo a flag for setting how mach information will be printed
     */
    public void printProjectInfo(boolean fullInfo) {
        if (fullInfo == true) {
            System.out.println("The MyProject");
            System.out.println("is intended to learn");
            System.out.println("the Java language.");
        } else {
            System.out.println("It is MyProject.");
        }
    }
}
