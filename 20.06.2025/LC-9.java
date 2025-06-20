class GenderCount {
    public static void main(String[] args) {
        String[] genders = {"M", "F", "M", "F", "F"};
        int male = 0, female = 0;
        for (String g : genders) {
            if (g.equals("M")) male++;
            else if (g.equals("F")) female++;
        }
        System.out.println("Male: " + male + ", Female: " + female);
    }
}
