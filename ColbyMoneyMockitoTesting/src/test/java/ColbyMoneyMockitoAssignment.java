import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ColbyMoneyMockitoAssignment {

    @Test
    public void TestStuff(){
        List<Item> items = mock(List.class);
        Item SDcard = new Item("1","SDcard", 1, 10);
        Item LEDlight = new Item("2","LEDlight",1, 10);
        Item DashCam = new Item("3","DashCam",2, 20);
        items.add(SDcard);
        items.add(LEDlight);
        items.add(DashCam);
        items.add(DashCam);
        Cart.setItems(items);

        assertEquals(60, Cart.getCartTotalAmount());

        when(items.get(0)).thenReturn(items.get(0).getPrice());
        assertEquals(10, items.get(0));

        when(items.get(1)).thenReturn(items.get(1).getPrice());
        assertEquals(10, items.get(1));

        when(items.get(2)).thenReturn(items.get(2).getPrice());
        assertEquals(20, items.get(2));

        when(items.get(3)).thenReturn(items.get(3).getPrice());
        assertEquals(20, items.get(3));
    }
}
