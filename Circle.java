package practice;

    class Circle implements CalcArea{
        public final static double PI = 3.14;
        private double r;
        public Circle(double r) {
            this.r = r;

        }

        @Override
        public double getArea() {
            // TODO Auto-generated method stub
            return PI*r*r;
        }
    }

    class Rectangle extends Circle{
        private double l;
        private double w;
        public Rectangle(double l,double x){
            super(l);
            this.l = l;
            this.w =x;
        }
        public double getArea() {
            return l*w;
        }
    }


