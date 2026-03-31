Question 1.

You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Examples:

Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 

Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.

Answerr-
  class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        while (top <= bottom && left <= right) {
            
            
            for (int i = left; i <= right; i++)
                list.add(mat[top][i]);
            top++;
            
            
            for (int i = top; i <= bottom; i++)
                list.add(mat[i][right]);
            right--;
            
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    list.add(mat[bottom][i]);
                bottom--;
            }
            
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(mat[i][left]);
                left++;
            }
        }
        
        return list;
    }
}

