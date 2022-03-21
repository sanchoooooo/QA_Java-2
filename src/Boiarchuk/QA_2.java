package Boiarchuk;

public class QA_2 {
    public static void main(String[] args) {
        int[][] array = new int[6][4];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 1; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max values: " + max);
    }
}
