package J1Kadai16;

public class JKad16S1 {
    public static void main(String[] args) {
        int[] heights = {160, 155, 170, 150, 175, 180, 165};
        int a;

        if (heights[1] > heights[6]){
            a = heights[6];
            heights[6] = heights[1];
            heights[1] = a;
        }

        if (heights[2] > heights[6]) {
            a = heights[6];
            heights[6] = heights[2];
            heights[2] = a;
        }

        if (heights[3] > heights[6]) {
            a = heights[6];
            heights[6] = heights[3];
            heights[3] = a;
        }

        if (heights[4] > heights[6]) {
            a = heights[6];
            heights[6] = heights[4];
            heights[4] = a;
        }

        if (heights[5] > heights[6]) {
            a = heights[6];
            heights[6] = heights[5];
            heights[5] = a;
        }

        for (int j = 0; j < heights.length; j++) {
            System.out.println("heights[" + j + "]�F" + heights[ j ] );
        }
    }
}
