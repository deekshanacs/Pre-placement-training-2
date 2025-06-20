class AverageMarks {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        int total = 0;
        for (int mark : marks) total += mark;
        double average = total / (double) marks.length;
        System.out.println("Average Marks: " + average);
    }
}
