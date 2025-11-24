//Name: Elizabeth Moore

import java.util.Scanner;

public class LabSolution04
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Matrix Adder!");

		System.out.print("Enter the length of the first maxtix: ");
		int length1 = kb.nextInt();


		System.out.print("Enter the width of the first maxtix: ");
		int width1 = kb.nextInt();
		int[][] matrix1 = new int[length1][width1];


		for(int y = 0; y < matrix1.length; y++) //loops to get the value for each spot in the array without having to type it out for each index
		{
			for(int x = 0; x < matrix1[y].length; x++)
			{
				System.out.print("Enter the value at index " + y + " " + x + ": ");
				int value = kb.nextInt();
				matrix1[y][x] = value;
			}
		}


		System.out.print("Enter the length of the second maxtix: ");
		int length2 = kb.nextInt();
		System.out.print("Enter the width of the second maxtix: ");
		int width2 = kb.nextInt();

		int[][] matrix2 = new int[length2][width2];


		if(length1 != length2 || width1 != width2) //Checks if either the lengths or widths are not equal before the second loop runs to prevent errors
		{
			System.out.println("Not Vaild! Matrix sizes much match.");
			System.exit(0);
		}


		for(int y = 0; y < matrix2.length; y++)
		{
			for(int x = 0; x < matrix2[y].length; x++)
			{
				System.out.print("Enter the value at index " + y + " " + x + ": ");
				int value = kb.nextInt();
				matrix2[y][x] = value;
			}
		}


		for(int y = 0; y < matrix1.length; y++) //prints out the first matrix
		{
			for(int x = 0; x < matrix1[y].length; x++)
			{
				System.out.print(matrix1[y][x] + " ");
			}
			System.out.println();
		}


		System.out.println("+");


		for(int y = 0; y < matrix2.length; y++) //prints out the second matrix
		{
			for(int x = 0; x < matrix2[y].length; x++)
			{
				System.out.print(matrix2[y][x] + " ");
			}
			System.out.println();
		}

		System.out.println("=");


		int[][] resultMatrix = new int[length2][width2]; //needed to make a new matrix to store our sum of both matrices


		for(int y = 0; y < resultMatrix.length; y++)
		{
			for(int x = 0; x < resultMatrix[y].length; x++)
			{
				resultMatrix[y][x] = matrix1[y][x] + matrix2[y][x]; // adds the number in in the [y][x] spot in matrix1 to the number in the [y][x] in matrix2 which will then be put into the same spot just in the new matrix
				System.out.print(resultMatrix[y][x] + " ");
			}
			System.out.println();
		}

	}
}
