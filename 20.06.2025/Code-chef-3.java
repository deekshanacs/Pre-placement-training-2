class TimeTable {
    public static void main(String[] args) {
        String[][] schedule = {
            {"Math", "Science", "English"},
            {"History", "Math", "PE"},
            {"Computer", "Science", "Arts"}
        };
        for (int i = 0; i < schedule.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            for (String subject : schedule[i]) System.out.print(subject + " ");
            System.out.println();
        }
    }
}
