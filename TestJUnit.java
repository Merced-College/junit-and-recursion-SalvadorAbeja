 import org.junit.Test;
 import static org.junit.Assert.*;

 public class TestJUnit{
    
    @Test
    public void testCountHi_1(){
        assertEquals(1, TestingRecursion.countHi("xxhixx"));
    }

    @Test
    public void testCountHi_2(){
        assertEquals(2, TestingRecursion.countHi("xxhixhix"));
    }

    @Test
    public void testCountHi_3(){
        assertEquals(8, TestingRecursion.countHi("hihihihihihihihi"));
    }

    @Test
    public void testCountHi_4(){
        assertEquals(0, TestingRecursion.countHi("hhhhhhhhhhhhxxxxxxxxxxxxx"));
    }

    @Test
    public void testCountHi_5(){
        assertEquals(0, TestingRecursion.countHi(null));
    }

    @Test
    public void testStringClean_1(){
        assertEquals("abcd", TestingRecursion.stringClean("aaaaaabbbbbbbccdddddd"));
    }

    @Test
    public void testStringClean_2(){
        assertEquals("abcd", TestingRecursion.stringClean("aaaaaabbcdd"));
    }

    @Test
    public void testStringClean_3(){
        assertEquals("abcd", TestingRecursion.stringClean("abcddddd"));
    }
    
    @Test
    public void testStringClean_4(){
        assertEquals("abcd", TestingRecursion.stringClean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcd"));
    }
    
    @Test
    public void testStringClean_5(){
        assertEquals("abcd", TestingRecursion.stringClean("abbbbbbccccccccccccccccccccccccccccccccccd"));
    }
 }