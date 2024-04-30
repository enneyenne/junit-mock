import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestGrade {

    @Test
    public void test_addGrade() {

        int gr = 5;

        Student st1 = new Student("Kate");
        st1.setGradeCheck(new GradeCheckMock());
        st1.addGrade(gr);

        Assertions.assertEquals(gr, st1.getGrades().get(0));

    }
}
