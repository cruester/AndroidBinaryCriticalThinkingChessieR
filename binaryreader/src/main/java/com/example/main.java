//This program converts a binary number to decimal form
package com.example;

public class main
{
    public static void main(String args[])
    {
        final int ARRAY_SIZE = 8; //A binary number is 8 bytes
        final int BIT_VALUE[] = {128, 64, 32, 16, 8, 4, 2, 1};
        int decimalDigit[] = new int[ARRAY_SIZE]; //This will hold each binary byte's decimal equivalent
        int binaryNum[] = {0, 0, 0, 1, 0, 0, 1, 1};
        int decimalNum = 0; //This holds final decimal result

        //Convert each byte to decimal equivalent
        for (int i = 0; i < ARRAY_SIZE; i++)
        {
            decimalDigit[i] = binaryNum[i] * BIT_VALUE[i];
            decimalNum = decimalNum + (decimalDigit[i]);
        }

        //Display results
        System.out.print("The binary number: ");
        for (int i = 0; i < ARRAY_SIZE; i++)
        {
            System.out.print(binaryNum[i]);
        }
        System.out.println(" Is the decimal number: " + decimalNum);

        System.out.println("Hopefully gitHub works!");
        System.out.println("Maybe this one will");

    }
}
