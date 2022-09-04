import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExerciseManagementTest {
    @Test
    public ExerciseManagementTest(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
}
