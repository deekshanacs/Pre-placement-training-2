class Library {
    public static void main(String[] args) {
        String[] books = {"Java", "Python", "C++"};
        String search = "Python";
        boolean found = false;
        for (String book : books) {
            if (book.equals(search)) found = true;
        }
        System.out.println(search + (found ? " is available" : " is not available"));
    }
}
