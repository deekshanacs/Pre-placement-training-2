class Point {
    double x;
    double y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3.5, 4.5);
        p1.display();
        p2.display();
    }
}
