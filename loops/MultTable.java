package loops;

public class MultTable {
    /*
        Welcome! In this module, you will be writing the code to create a multiplication table generator. 

        Please follow the prompts below, and write your code in the allotted sections. 
        When you are finished, run your code by clicking the triangle on the top-right corner.
    */
    public static void main(String[] args) {
        // 1. We will begin by choosing the first number to multiply. Create a variable with a number from 1 to 10. 
        // ---- BEGIN CODE ----
        // int num1 = 1;

        // ---- END CODE ----


        // 2. Print the variable doubled (ie. "__ x 2 = __") 
        // ---- BEGIN CODE ----
        // System.out.println(num1 + " x 2 = " + num1*2);

        // ---- END CODE ----


        // 3. Now do this for tripled, quadrupled, so on, until "__ x 10 = __"
        // ---- BEGIN CODE ----

        // ---- END CODE ----


        // 3. Modify your code from above to print the multiplication problems from 1 through 10 
        // using a for loop instead.
        // Use the below scaffolding as a helper: 
        // 
        for(int j = 1; j <= 10; j++){
            for (int i = 2; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + j*i); 
            }
            System.out.println();
        }


        // 4. Modify your program so that it prints a multiplication table for a different number.

        // 5. Modify your program so that the first number also varies from 1 to 10. You should get all the possible combinations
        //    of multiplications from 1 to 10. 
        // (Hint: what happens if you move one for loop inside another?)
    }
}
