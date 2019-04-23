package mil.army.usace.hec.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddingWidgetFactoryTest {

    @ParameterizedTest(name = "Run {index}: a={0}, b={1}, expectAdd={2}")
    @MethodSource("testAddingWidget_Parameters")
    public void testAdd(float a, float b, float expectAdd) throws Throwable {
        AddingWidget underTest = AddingWidgetFactory.getAddingWidget(a, b);
        float result = underTest.add();
        assertEquals(expectAdd, result);
    }

    static Stream<Arguments> testAddingWidget_Parameters() throws Throwable {
        return Stream.of(
                Arguments.of(0f, 1f, 1f),
                Arguments.of(2f, 3f, 5f),
                Arguments.of(3f, 5f, 8f)
        );
    }

}