package pro.sky.java.course2.Lesson5_enumOOP.transport;

public enum Size {
    EXTRA_SMALL(0, 10),
    SMALL(10, 25),
    LARGE(40, 50),
    ESPECIALLY_LARGE(100, 120);

    final int MIN;
    final int MAX;


    Size(int min, int max) {
        if (max > min || (max == min && min>0)) {
            if (min < 0) {
                this.MIN = 0;
            } else {
                this.MIN = min;
            }
            this.MAX = max;
        } else  {
            this.MIN = 0;
            this.MAX = 10;
        }
    }

    @Override
    public String toString() {
        if (MIN == 0) {
            return  " counts of sits " + MAX+ ", ";
        } else if (MIN > 0 && MAX!=MIN) {
            return " counts of sits " + MIN+"-"+ MAX + ", ";
        }else if (MAX == MIN) {
            return " counts of sits " + MIN+ ", ";
        } else return "ALL BROKEN";
    }
}
