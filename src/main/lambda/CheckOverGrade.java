package main.lambda;

public class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student4 s) {
        return s.avg>8;
    }
}
