public class ShortQuestions {

    public static int findMin(int[] array) {
        int min = array[0]; // assume non-empty
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}



