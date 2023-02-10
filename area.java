public class area {
    static class mathmetics {
        int sq;
        public int square() {
            return sq  *  sq;
        }

        public int peramiter() {
            return 4 * sq;
        }
    }
        public static void main(String[] args) {
            mathmetics math = new mathmetics();
            math.sq = 3;
            System.out.println(math.square());
            System.out.println(math.peramiter());

    }
}
