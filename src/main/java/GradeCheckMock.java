public class GradeCheckMock implements GradeCheck {

        public boolean checkGrade(int grade) {
            return grade >= 2 && grade <= 5;
        }

    }