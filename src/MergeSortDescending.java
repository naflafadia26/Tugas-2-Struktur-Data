public class MergeSortDescending {

    public static void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);

            merge(data, left, mid, right);
        }
    } 

    public static void merge(int[] data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = data[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = data [mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data [k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data [k] = R[j];
            j++;
            k++;
        }
    }

    public static void main (String[] args) {
        int[] nilai = {42, 15, 67, 23, 89, 10, 55, 31};

        mergeSort(nilai, 0, nilai.length - 1);

        System.out.println("Hasil pengurutan (desc) : ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
    }
}