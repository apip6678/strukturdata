public class tugas2counting {

    public static void countingSortDescending(int[] arr) {
        int max = arr[0];

        for (int x : arr) {
            if (x > max) max = x;
        }

        int [] count = new int [max + 1];

        for (int x : arr) {
            count[x]++;
        }

        int idx = 0;

        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            } 
        }
    }

    public static void main(String[] args) {
        int[] data = {8, 3, 15, 6, 9, 2, 11, 4};
        
        System.out.println("Data Sebelum Sorting:");
        for (int x : data ) System.out.print(x + " ");

        countingSortDescending(data);

        System.out.println("\nData setelah counting sort (DESCENDING):");
        for (int x : data ) System.out.print(x + " ");
    }
}