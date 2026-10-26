package com.DSA;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(heights);
        System.out.println("Maximum water area: " + result);
    }

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;

            int minHeight = Math.min(
                    heights[left],
                    heights[right]
            );

            int area = width * minHeight;
            maxWater = Math.max(maxWater, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
