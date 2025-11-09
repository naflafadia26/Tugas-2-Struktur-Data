public class CountingSortDescending {

    public static void countingSort(int[] data) {
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < data.length; i++) {
            count[data[i]]++;
        }

        int index = 0;

        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                data[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nilai = {8, 3, 12, 5, 9, 2, 15, 7};

        countingSort(nilai);

        System.out.println("Hasil pengurutan (desc):");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
    }
}
