/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5_Abstract_Nested_Classes_Example_Inner;

public class MemberClass {

    public static void main(String[] args) {
// one way:
        OC a = new OC();
        OC.IC b = a.new IC();
        b.print(); // outputs 3
// another way:
        new OC().new IC().print(); // outputs 3
    }
}

class OC {

    private int x = 1;

    public class IC {

        private int y = 2;

        public void print() {
            System.out.println("x="+x+" "+"y="+ y);
        }
    }
}
