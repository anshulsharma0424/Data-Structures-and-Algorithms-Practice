package S03_BitManipulation;

public class Q03_Operators {

    public static void main(String[] args) {

        // AND [ & ] => All true means true, One false means false.


        // OR [ | ] => All false means false, One true means true.


        // XOR [ ^ ] => If number of ones are even -> 0, If number of ones are odd -> 1


        // Right shift [ >> ] => shifting the bits to the right by one place. X >> K means X / 2pow(k)


        // Left shift [ << ] => shifting the bits to the left by one place. X << K means X * 2pow(k). Can cause overflow -- Always do within boundary i.e. [ 2pow(32) - 1 ]


        // NOT [ ~ ] => Step-1: Flip the number. Step-2: Check whether it is a positive or a negative number (check the first digit is '1' or '0'). If the number after flipping is -ve then store the 2's complement. Else, store it just after flipping in case of +ve.
        // 13 = 000000....1101 ---> 111111.....0010 ---> -ve = 2's complement ---> 000000.....1101 + 1 = 000000.....1110 = 14 but, it was -ve therefore it will be stored as -14.
        // Basically its like - if we do 'NOT' of '+X' it will be -ve of (X+1) and if we do 'NOT' of '-X' it will be +ve of (X-1)
        System.out.println(~999); // -1000
        System.out.println(~-999); // 998

        
    }
}

