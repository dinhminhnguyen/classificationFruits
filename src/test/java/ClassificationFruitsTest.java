import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClassificationFruitsTest {
    @Test
    public void test1(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("lemon",classificationFruits.classification("yellow", 5.9));
    }
    @Test
    public void test2(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("orange",classificationFruits.classification("yellow", 7.0));
    }
    @Test
    public void test3(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("lemon",classificationFruits.classification("yellow", 5.2));
    }
    @Test
    public void test4(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("lemon",classificationFruits.classification("green", 3.1));
    }
    @Test
    public void test5(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("orange",classificationFruits.classification("green", 5.9));
    }
    @Test
    public void test6(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("invalid",classificationFruits.classification("yellow", 3.4));
    }
    @Test
    public void test7(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("orange",classificationFruits.classification("green", 6.1));
    }
    @Test
    public void test8(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("invalid",classificationFruits.classification("green", 7.9));
    }
    @Test
    public void test9(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("lemon",classificationFruits.classification("yellow-green", 4.5));
    }
    @Test
    public void test10(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("lemon",classificationFruits.classification("yellow-green", 5.2));
    }@Test
    public void test11(){
        ClassificationFruits classificationFruits = new ClassificationFruits();
        assertEquals("orange",classificationFruits.classification("yellow-green", 8.0));
    }


}
