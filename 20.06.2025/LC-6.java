class Request {
    String msg = "Request for leave";

    void approve() {
        System.out.println("Approved: " + msg);
    }

    public static void main(String[] args) {
        new Request().approve();
    }
}
