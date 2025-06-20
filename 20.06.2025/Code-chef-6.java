class Result {
    public static void main(String[] args) {
        int[] marks = {60, 55, 65};
        for (int mark : marks) {
            if (mark < 40) {
                System.out.println("Result: Fail");
                return;
            }
        }
        System.out.println("Result: Pass");
    }
}
