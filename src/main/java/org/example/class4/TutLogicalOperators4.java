package org.example.class4;

import java.util.Scanner;

public class TutLogicalOperators4 {
    public static void main(String[] args) {

    // logical operators - operators used to construct complex conditions;
    // logical AND operator: &&
    // logical OR operator: ||
    // logical NOT operator: !
    // These operators are used between Boolean values, and the result is also a Boolean value.
    // Combining conditions:
    // AND: condition_1 && condition_2 && conditions_n
    // AND - true if all conditions are true;
    // OR: condition_1 || condition_2 || condition_n
    // OR - true if at least one condition is true;
    // NEGATING A BOOLEAN VALUE:
    // NOT: negates a Boolean value;
    // !true = false
    // !false = true
    /*
    EXAMPLES:
     */
        boolean b1 = true && true; //true
        System.out.println(b1);
        boolean b2 = b1 && false && true; //false
        System.out.println(b2);
        boolean b3 = b2 || true; //true
        System.out.println(b3);
        boolean b4 = !b2; //true
        System.out.println(b4);
        boolean b5 = !(b4 && b2); //true
        System.out.println(b5);

    /*
    if isRaining || isCold -> wear a Jacket;

    if n>= 1 && n <= 10 -> n is between 1 and 10;
     */


    }
}
