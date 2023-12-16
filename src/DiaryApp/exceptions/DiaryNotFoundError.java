package DiaryApp.exceptions;

public class DiaryNotFoundError extends RuntimeException{
    public DiaryNotFoundError(String diaryNotFoundErrorMessage){
        super(diaryNotFoundErrorMessage);
    }

}
