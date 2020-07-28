package com.OOPS;



public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);

       try {

          System.out.println(stack.pop());
          System.out.println(stack.pop());
          System.out.println(stack.pop());
        }
        catch (Exception e)         //handles exception
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("to kese ho aap log");
        }
        stack.display();
           System.out.println("Hello");

    }
}
