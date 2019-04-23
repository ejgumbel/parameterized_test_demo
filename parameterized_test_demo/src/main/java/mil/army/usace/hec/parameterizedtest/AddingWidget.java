package mil.army.usace.hec.parameterizedtest;

public class AddingWidget {
    private final float a;
    private final float b;

    public AddingWidget(float x, float y) {
        a = x;
        b = y;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float add() {
        return getA() + getB();
    }
}
