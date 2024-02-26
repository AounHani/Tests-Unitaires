package testsTp0.Exo2;

import org.example.Exo1.Person;
import org.example.Exo2.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private static Stack stack;
    @BeforeEach //directive pour la preparation de l environnement avant chaque test
    void SetUp(){
        stack = new Stack();
    }
    @Test // pile n est pas pleine
    void pushShouldAddElementToTheTopOfTheStack(){
        // Act
        stack.push(1);
        // Assert
        assertEquals(1, stack.size());
        assertEquals(1, stack.peek());
    }
    @Test
    void pushShouldExpandArrayIfStackIsFull(){
        // Act
        for(int i=0;i<10;i++) {
            stack.push(i);
        }
        assertEquals(10, stack.size());
        stack.push(100);
        // Assert
        assertEquals(11, stack.size());
        assertEquals(100, stack.peek());
    }
    @Test
    void popShouldReturnTheElementAtTheTopIfStackIsNotEmpty(){
        stack.push(1);
        // Assert
        assertEquals(1, stack.size());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    void popShouldRaiseExceptionIfStackIsEmpty(){
        // Assert
        assertThrows(IllegalStateException.class, ()->stack.pop());
    }
    // verifie empty
    @Test
    void sizeShouldReturn0IfStackIsEmpty(){
        // Assert
        assertEquals(0, stack.size());
    }
    @Test
    void sizeShouldReturnNumbreGreateThan0IfStackIsNotEmpty(){
        // Assert
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    void peekShouldRaiseExceptionIfStackIsEmpty(){
        // Assert
        assertThrows(IllegalStateException.class, ()->stack.peek());
    }
    @Test
    void peekShouldReturnNumbreIfStackIsNotEmpty(){
        // Assert
        stack.push(1);
        assertEquals(1, stack.peek());
    }
    @Test
    void isEmptyShouldReturnTrueIfStackIsEmpty(){
        // Assert
        assertTrue(stack.isEmpty());
    }
    @Test
    void isEmptyShouldReturnFalseIfStackIsNotEmpty(){
        // Assert
        stack.push(1);
        assertFalse(stack.isEmpty());
    }


}
