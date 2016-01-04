package com.kolamomo.leetcode;

/**
 *  Minimum Path Sum My Submissions Question
 *  
 *  <p>Given a m x n grid filled with non-negative numbers, <br>
 *  find a path from top left to bottom right which minimizes the sum of all numbers along its path.<br>
 *  Note: You can only move either down or right at any point in time.<br>
 * @author Jay
 *
 */
public class Ex64 {
    public int minPathSum(int[][] grid) {
    	int m = grid.length;
    	if(m == 0) {
    		return 0;
    	}
    	int n = grid[0].length;
    	int[][] path = new int[m][n];
    	path[0][0] = grid[0][0];
    	for(int i = 1; i < m; i++) {
    		path[i][0] = path[i -1][0] + grid[i][0];
    	}
    	for(int j = 1; j < n; j++) {
    		path[0][j] = path[0][j-1] + grid[0][j];
    	}
    	for(int i = 1; i < m; i++) {
    		for(int j = 1; j < n; j++) {
    			path[i][j] = Math.min(path[i-1][j], path[i][j-1]) + grid[i][j];
    		}
    	}
    	return path[m-1][n-1];
    }
}
