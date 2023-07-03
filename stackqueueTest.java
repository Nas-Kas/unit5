import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class stackqueueTest {
    stackqueue st = new stackqueue();

    @ParameterizedTest
    @ValueSource(strings = {"()", "{()}", "{})", ")("})
    public void testIsValid(String input) {
        assertTrue(st.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"({)", "({})>", "})("})
    public void testIsNotValid(String input) {
        assertFalse(st.isValid(input));
    }
}
