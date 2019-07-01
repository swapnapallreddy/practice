package com.coding.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TicTocToe {
	static String[] board;
	static String turn;

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		board = new String[9];
		turn ="O";
		String winner = null;
		populateEmptyBoard();
		printBoard();
		int slot;
		System.out.println("O will play first, enter a slot number between 1-9 to  place O in");
		while(winner==null)
		{
			slot=s.nextInt();
			if(board[slot-1].equals(String.valueOf(slot)))
			{				
				board[slot-1] =turn;

				if(turn=="O")
					turn="X";
				else
					turn ="O";
				printBoard();
			}
			else
			{
				System.out.println("slot already taken, chose another slot between 0-9");
				continue;
			}
			winner=checkWinner();
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}


	}
	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}


	private static void printBoard()
	{
		System.out.println("-----");
		System.out.println(board[0]+"|"+board[1]+"|"+board[2]);
		System.out.println("-----");
		System.out.println(board[3]+"|"+board[4]+"|"+board[5]);
		System.out.println("-----");
		System.out.println(board[6]+"|"+board[7]+"|"+board[8]);


	}

	private static void populateEmptyBoard()
	{
		for(int i=0;i<9;i++)
			board[i] =String.valueOf(i+1);
	}
}
