package entities;

public class FinishedCourse extends Course {
    //constructors
    public FinishedCourse(String _name, Professor _professor, Grade _minGrade, int _year, Grade _grade, boolean _passed) {
        super(_name, _professor, _minGrade, _year);
        grade = _grade;
        passed = _passed;
    }

    //attributes
    private Grade grade;
    private boolean passed;
    //getters

    public Grade getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return passed;
    }

    //setters

    public void setGrade(Grade _grade) {
        grade = _grade;
    }

    public void setPassed(boolean _passed) {
        passed = _passed;
    }
}
