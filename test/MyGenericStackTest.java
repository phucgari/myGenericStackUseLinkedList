import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyGenericStackTest {
    MyGenericStack<String> stack=new MyGenericStack<>();
    @Test
    void testConstructor(){}
    @Test
    void testPush(){
        stack.push("a");
        stack.push("b");
        stack.push("c");
    }
    @Test
    void testPushAndPop(){
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals("c",stack.pop());
        assertEquals("b",stack.pop());
        assertEquals("a",stack.pop());
    }
    @Test
    void testSize(){
        assertEquals(0,stack.size());
        stack.push("a");
        assertEquals(1,stack.size());
        stack.push("b");
        assertEquals(2,stack.size());
        assertEquals("b",stack.pop());
        assertEquals(1,stack.size());
        assertEquals("a",stack.pop());
        assertEquals(0,stack.size());
    }
    @Test
    void testIsEmpty(){
        assertEquals(true,stack.isEmpty());
        stack.push("a");
        assertEquals(false,stack.isEmpty());
        assertEquals("a",stack.pop());
        assertEquals(true,stack.isEmpty());
    }
}