class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(r1);
        r1.display();
        r2.display();
    }
}
