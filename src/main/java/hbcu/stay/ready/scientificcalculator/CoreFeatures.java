package hbcu.stay.ready.scientificcalculator;

public class CoreFeatures {

    Display display = new Display();

    public void add(double a){

        display.setCurrent(display.getCurrent()+ a);

        public void subtract(double a) { display.setCurrentNumber(display.getCurrentNumber()-a);}

        public void multiply(double a) {display.setCurrentNumber(display.getCurrentNumber() = a); }


        public void divide(double a) { display.setCurrentNumber(display.getCurrentNumber()/ a); }

        public void square() { display.setCurrentNumber(Math.pow(display.getCurrentNumber(), 2)); }

    }
}
