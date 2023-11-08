package OopIdeasTwo;
public class Problem {
    private String name;
    private Type type;
    private boolean isSolved;

    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }
    public Type getType(){
        return type;
    }
    public boolean isSolved(){
        return isSolved;
    }

    public void setSolved(boolean solved){
        isSolved = solved;
    }
}
