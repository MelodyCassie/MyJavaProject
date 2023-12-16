package DiaryApp.exceptions;

public class DiaryIsLockedError extends RuntimeException{
    public DiaryIsLockedError (String diaryIsLockedErrorMessage){
        super(diaryIsLockedErrorMessage);
    }
}
