package testsTp0.Exo1;
import org.example.Exo1.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @Test
    void getFullNameTest(){
        // Arrange
        Person person = new Person("Aoun","Hani", 23);
        // Act
        String fullName = person.getFullName();
        // Assert
        assertEquals("Aoun Hani", fullName);
    }
    @Test
    void isAdultShouldReturnTrueGreaterOrEqualTo18(){
        // Arrange
        Person person = new Person("Aoun","Hani", 23);
        //Act
        boolean GreaterOrEqualTo18 = person.isAdult();     // Assert
        assertTrue(GreaterOrEqualTo18);
    }
    @Test
    void isAdultShouldReturnFalseIfAgeIsLessThan18(){
        // Arrange
        Person person = new Person("Aoun","Hani", 17);
        //Act
        boolean lessThan18 = person.isAdult();     // Assert
        assertFalse(lessThan18);
    }

}
