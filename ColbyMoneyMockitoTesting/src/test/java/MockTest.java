

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {

    @Test
    public void MockList() {
        List MockList = mock(List.class);
        when(MockList.size()).thenReturn(3).thenReturn(4);
        assertEquals(3, MockList.size());
        assertEquals(4, MockList.size());

        when(MockList.get(0)).thenReturn("Mockito");
        assertEquals("Mockito", MockList.get(0));

        when(MockList.get(anyInt())).thenReturn("Mockito");
        assertEquals("Mockito", MockList.get(1000));
    }

    @Test
    public void MockListException() {
        List MockList = mock(List.class);
        when(MockList.get(anyInt())).thenThrow(new RuntimeException("Can not take integer"));

        Exception exception = assertThrows(RuntimeException.class, ()->MockList.get(anyInt()));

        String actualMessage=exception.getMessage();
        String expectedMessage="Can not take integer";

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
