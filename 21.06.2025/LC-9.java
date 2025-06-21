class RandomNormal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            double u = Math.random();
            double v = Math.random();
            double z = Math.sqrt(-2 * Math.log(u)) * Math.cos(2 * Math.PI * v);
            System.out.println("Random normal: " + z);
        }
    }
}
