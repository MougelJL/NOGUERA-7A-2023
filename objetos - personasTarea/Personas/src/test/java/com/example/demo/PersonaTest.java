import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void testEquals() {
        Persona persona1 = new Persona("John", "Doe");
        Persona persona2 = new Persona("John", "Doe");
        Persona persona3 = new Persona("Jane", "Smith");

        // Verificar que persona1 y persona2 sean iguales
        assertTrue(persona1.equals(persona2));

        // Verificar que persona1 y persona3 no sean iguales
        assertFalse(persona1.equals(persona3));
    }

    @Test
    public void testHashCode() {
        Persona persona1 = new Persona("John", "Doe");
        Persona persona2 = new Persona("John", "Doe");

        // Verificar que el hashCode de persona1 y persona2 sea el mismo
        assertEquals(persona1.hashCode(), persona2.hashCode());
    }

    @Test
    public void testToString() {
        Persona persona = new Persona("John", "Doe");

        // Verificar que el toString retorne el formato esperado
        assertEquals("John / Doe", persona.toString());
    }
}
