// https://leetcode.com/problems/available-captures-for-rook/
public class Available_Captures_for_Rook {
	
	public int numRookCaptures(char[][] board) {
		int rookRow = 0;
		int rookColumn = 0;
		boolean rookFound = false;
		for (int row = 0; row < 8 && !rookFound; row++) {
			for (int column = 0; column < 8 && !rookFound; column++) {
				if (board[row][column] == 'R') {
					rookRow = row;
					rookColumn = column;
					rookFound = true;
				}
			}
		}
		int[][] template = {
				{
						-1, 0
				}, {
						1, 0
				}, {
						0, -1
				}, {
						0, 1
				}
		};
		int captures = 0;
		boolean[] invalidDirection = new boolean[4]; 
		for(int m = 1; m<=7; m++) {
			for(int i =0; i<template.length; i++) {
				int targetRow = rookRow + m * template[i][0]; 
				int targetColumn = rookColumn + m * template[i][1];
				if(!invalidDirection[i]
						&& targetRow >= 0 && targetRow < 8
						&& targetColumn >=0 && targetColumn < 8) {
					if(board[targetRow][targetColumn] != '.') {
						invalidDirection[i] = true;
					}
					if(board[targetRow][targetColumn] == 'p') {
						captures++;
					}
				} else {
					invalidDirection[i] = true;
				}
			}
		}
		return captures;
	}
}
