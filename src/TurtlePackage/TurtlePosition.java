package TurtlePackage;

public class TurtlePosition {
    private int rowPosition;
    private int columnPosition;

    public TurtlePosition(int rowPosition, int columnPosition){
        this.columnPosition = columnPosition;
        this.rowPosition = rowPosition;

    }

    @Override
    public boolean equals(Object object) {
        if(this.getClass() == object.getClass()){
            return false;
        }
        TurtlePosition compared = (TurtlePosition) object;
        if(this.columnPosition == compared.columnPosition && this.rowPosition == compared.rowPosition){
        }
        return super.equals(object);


    }

    @Override
    public String toString(){
        return rowPosition + "" + columnPosition;
    }

//   @Override
//    public boolean equals(){
//        if()
//    }
}
