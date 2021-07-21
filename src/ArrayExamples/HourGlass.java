package ArrayExamples;

public class HourGlass {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 1,-1,  0, 0, 0},
                {0, -1, 0,  0, 0, 0},
                {-1,-1,-1,  0, 0, 0},
                {0, -9, 2, -4,-4, 0},
                {-7, 0, 0, -2, 0, 0},
                { 0, 0,-1, -2,-4, 0}
        };

        int glassSum = 0, colCount = 0, colStep = 0, maxSum = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length - 2; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (colCount < 3) {
                    if (colCount != 0 && colCount != 2) {
                        glassSum = glassSum + arr[r][c] + arr[r + 1][c] + arr[r + 2][c];
                    } else {
                        glassSum = glassSum + arr[r][c] + arr[r + 2][c];
                    }
                    colCount++;
                } else {
                    if (maxSum < glassSum) {
                        maxSum = glassSum;
                    }
                    c = colStep++;
                    colCount = 0;
                    glassSum = 0;
                }
            }
            if (maxSum < glassSum) {
                maxSum = glassSum;
            }
            colCount = 0;
            glassSum = 0;
            colStep = 0;
        }
    }
}
