public class clculatorareatovolume {

    static class calculator{
        private double area;
        private double volume;

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }
    }

    public static void main(String[] args) {

        calculator mycalculator = new calculator();
        mycalculator.setArea(27);
        System.out.println(mycalculator.getArea());
        mycalculator.setVolume(20);
        System.out.println(mycalculator.getVolume());

    }
}
