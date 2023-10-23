import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {


  
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {4, 6, 7, 1};
    ArrayExamples.reverseInPlace(input2);
    // System.out.println(ArrayExamples.reverseInPlace(input1));
    assertArrayEquals(new int[]{1, 7, 6, 4}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {4, 6, 7, 1};
    assertArrayEquals(new int[]{1, 7, 6, 4}, ArrayExamples.reversed(input2));
  }
}
