import java.util.HashSet;

class Duplicates {
    public static void main(String[] args) {
        int[] rollNos = {101, 102, 103, 101};
        HashSet<Integer> set = new HashSet<>();
        boolean dup = false;
        for (int roll : rollNos) {
            if (!set.add(roll)) dup = true;
        }
        System.out.println(dup ? "Duplicates found" : "No duplicates");
    }
}
