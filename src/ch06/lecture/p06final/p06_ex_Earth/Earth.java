package ch06.lecture.p06final.p06_ex_Earth;

public class Earth {
    static final double EARTH_RADIUS = 6400;

    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
