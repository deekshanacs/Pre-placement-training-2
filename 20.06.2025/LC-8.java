class ReportCard {
    public static void main(String[] args) {
        String name = "Rahul";
        int[] marks = {78, 82, 89};
        int total = 0;
        for (int m : marks) total += m;
        double avg = total / 3.0;
        System.out.println("Student: " + name + "\nTotal: " + total + "\nAverage: " + avg);
    }
}
