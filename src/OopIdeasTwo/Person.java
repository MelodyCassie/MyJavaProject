package OopIdeasTwo;

import java.util.ArrayList;
import java.util.List;
public class Person {
    private List<Problem> problems;

    public Person() {
        problems = new ArrayList<>();
    }
    public void addProblem(String name, Type type){
        Problem problem = new Problem(name, type);
        problems.add(problem);
    }

    public void solveProblem(Problem problem){
        problem.setSolved(true);
    }

    public List<Problem> getUnsolvedProblems() {
        List<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolvedProblems.add(problem);
            }
        }
        return unsolvedProblems;
    }



}
