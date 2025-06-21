class BinarySearch {
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1, steps = 0;
        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Steps: " + steps);
                return mid;
            }
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Steps: " + steps);
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Index: " + search(arr, 7));
    }
}
