package J1Kadai16;

public class JKad16X {
    public static void main(String[] args) {
        int[] heights = {160, 155, 170, 150, 175, 180, 165};

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            System.out.println("heights[" + i + "]�F" + heights[ i ] );
        }
    }
}
