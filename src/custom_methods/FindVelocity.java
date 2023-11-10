package custom_methods;

public class FindVelocity {
    public static double findPositionChange(double pStart, double pFinal) {
        double pChange = pFinal - pStart;
        return pChange;
    }

    public static double findVelocity(double pStart, double pFinal, double time) {
        return findPositionChange(pStart, pFinal) / time;
    }
}
