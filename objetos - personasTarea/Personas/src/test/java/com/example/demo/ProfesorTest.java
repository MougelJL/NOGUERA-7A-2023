import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorTest {

    @Test
    public void testEquals() {
        Profesor profesor1 = new Profesor("John", "Doe", "12345");
        Profesor profesor2 = new Profesor("John", "Doe", "12345");
        Profesor profesor3 = new Profesor("Jane", "Smith", "67890");

        // Verificar que profesor1 y profesor2 sean iguales
        assertTrue(profesor1.equals(profesor2));

        // Verificar que profesor1 y profesor3 no sean iguales
        assertFalse(profesor1.equals(profesor3));
    }

    @Test
    public void testHashCode() {
        Profesor profesor1 = new Profesor("John", "Doe", "12345");
        Profesor profesor2 = new Profesor("John", "Doe", "12345");

        // Verificar que el hashCode de profesor1 y profesor2 sea el mismo
        assertEquals(profesor1.hashCode(), profesor2.hashCode());
    }

    @Test
    public void testToString() {
        Profesor profesor = new Profesor("John", "Doe", "12345");

        // Verificar que el toString retorne el formato esperado
        assertEquals("John / Doe / 12345", profesor.toString());
    }

    @Test
    public void testGetIosfa() {
        Profesor profesor = new Profesor("John", "Doe", "12345");

        // Verificar que el iosfa retorne el valor correcto
        assertEquals("12345", profesor.getIosfa());
    }

    @Test
    public void testSetIosfa() {
        Profesor profesor = new Profesor("John", "Doe", "12345");

        // Cambiar el iosfa del profesor
        profesor.setIosfa("67890");

        // Verificar que el iosfa haya sido actualizado correctamente
        assertEquals("67890", profesor.getIosfa());
    }
}
