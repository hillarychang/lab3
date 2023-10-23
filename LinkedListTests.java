import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {


  
	@Test 
	public void test() {


    LinkedList test1 = new LinkedList();

    test1.append(4);
    test1.append(5);
    test1.append(6);


    int firstValue = test1.first();
    int lastValue = test1.last();

    assertEquals(firstValue, 4);
    assertEquals(lastValue, 5);

    int length = test1.length();
    assertEquals(length, 3);

	}

}