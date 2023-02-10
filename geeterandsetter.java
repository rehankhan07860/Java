public class geeterandsetter {

    static class cylender{
      private  int height;
       private int radius;

        public int getHeight() {
            return height;
        }


        public void setHeight(int height) {
            this.height = height;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double surfaceare(){
            return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        }
        public double volumbe(){
            return 2 * Math.PI * radius * height;
        }

    }

    public static void main(String[] args) {

        cylender mycylender = new cylender();
        mycylender.setHeight(12);
        System.out.println(mycylender.getHeight());
        mycylender.setRadius(20);
        System.out.println(mycylender.getRadius());
        System.out.println(mycylender.surfaceare());
        System.out.println(mycylender.volumbe());


    }
}
