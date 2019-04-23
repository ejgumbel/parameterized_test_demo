package mil.army.usace.hec.parameterizedtest;

public class AddingWidgetFactory {
    public static AddingWidget getAddingWidget(float x, float y) {
        return new AddingWidget(x, y);
    }
}
