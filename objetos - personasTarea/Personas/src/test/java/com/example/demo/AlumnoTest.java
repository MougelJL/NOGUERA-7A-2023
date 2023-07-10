import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoTest {

    @Test
    public void testEquals() {
        Alumno alumno1 = new Alumno("John", "Doe", 123);
        Alumno alumno2 = new Alumno("John", "Doe", 123);
        Alumno alumno3 = new Alumno("Jane", "Smith", 456);

        // Verificar que alumno1 y alumno2 sean iguales
        assertTrue(alumno1.equals(alumno2));

        // Verificar que alumno1 y alumno3 no sean iguales
        assertFalse(alumno1.equals(alumno3));
    }

    @Test
    public void testHashCode() {
        Alumno alumno1 = new Alumno("John", "Doe", 123);
        Alumno alumno2 = new Alumno("John", "Doe", 123);

        // Verificar que el hashCode de alumno1 y alumno2 sea el mismo
        assertEquals(alumno1.hashCode(), alumno2.hashCode());
    }

    @Test
    public void testToString() {
        Alumno alumno = new Alumno("John", "Doe", 123);

        // Verificar que el toString retorne el formato esperado
        assertEquals("John / Doe / 123", alumno.toString());
    }

    @Test
    public void testGetLegajo() {
        Alumno alumno = new Alumno("John", "Doe", 123);

        // Verificar que el legajo retorne el valor correcto
        assertEquals(123, alumno.getLegajo());
    }

    @Test
    public void testSetLegajo() {
        Alumno alumno = new Alumno("John", "Doe", 123);

        // Cambiar el legajo del alumno
        alumno.setLegajo(456);

        // Verificar que el legajo haya sido actualizado correctamente
        assertEquals(456, alumno.getLegajo());
    }
}
