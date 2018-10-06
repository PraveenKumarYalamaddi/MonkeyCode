package junit.code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class TestAStack {

	Stack<Object> stack;
	
	@BeforeAll
	@DisplayName("Creating a stack instance")
	@Test
	static void createStack() {
		new Stack<>();
	}
	
	@Nested
	@DisplayName("When new created")
	class WhenNew {
		@BeforeEach
		@Test
		void createNewStack() {
			stack = new Stack<>();
		}
		
		@Test
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}
		
		@Test
		@DisplayName("Throwing exception when it is poped")
		void thowExceptionPop() {
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}
		
		@Test
		@DisplayName("Throwing Exception when it is peeked")
		void throwExceptionPeek() {
			assertThrows(EmptyStackException.class, ()-> stack.peek());
		}
		
		@Nested
		@DisplayName("When pushed")
		class pushToStack{
			
			String anElement = "an element";
            @BeforeEach
            void pushAnElement() {
                stack.push(anElement);
            }
            
            @Test
            @DisplayName("it is no longer empty")
            void isNotEmpty() {
                assertFalse(stack.isEmpty());
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            void returnElementWhenPopped() {
                assertEquals(anElement, stack.pop());
                assertTrue(stack.isEmpty());
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked() {
                assertEquals(anElement, stack.peek());
                assertFalse(stack.isEmpty());
            }
            
		}
	}

}
