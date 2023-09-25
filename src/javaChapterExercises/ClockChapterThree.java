package javaChapterExercises;

public class ClockChapterThree {
    private int hour;
    private int minute;
    private int second;

    public ClockChapterThree(int hour, int minute, int second){
        if(hour > 23){
            hour = 0;
        }
        else {
            this.hour = hour;
        }

        if(minute > 59){
            minute = 0;
        }
        else {
            this.minute = minute;
        }

        if(second > 59){
            second = 0;
        }
        else {
            this.second = second;
        }
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getSecond(int second){
        return second;
    }
    public void checkTime(){
        System.out.printf("The time is %d : %d : %d",hour, minute, second);
    }

}
