package pro.sky.java.course2.Lesson5_enumOOP.transport;

public enum LoadCapacity {
    N1(Float.MIN_VALUE, 3.5f),
    N2(3.5f, 12f),
    N4(0, 0), // удалить
    N3(12f, Float.MAX_VALUE);

    final Float MIN;
    final Float MAX;


    LoadCapacity(float min, float max) {
        if (max > min || (max == min && min>0)) {
            if (min < 0f) {
                this.MIN = 0f;
            } else {
                this.MIN = min;
            }
                this.MAX = max;
        } else  {
            this.MIN = 0f;
            this.MAX = 3.5f;
        }
    }

    @Override
    public String toString() {
        if (MIN == 0f) {
            return  " max load capacity " + MAX+ ", ";
        } else if (MIN > 0f && MAX < Float.MAX_VALUE && MAX!=MIN) {
            return " load capacity " + MIN+"-"+ MAX + ", ";
        }else if (MAX == Float.MAX_VALUE || MAX == MIN) {
            return "load capacity more " + MIN+ ", ";
        } else return "ALL BROKEN";
    }
}

