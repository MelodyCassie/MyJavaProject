package DiaryApp.exceptions;

public class EntryNotFoundError extends RuntimeException{
    public EntryNotFoundError (String entryNotFoundErrorMessage){
        super(entryNotFoundErrorMessage);
    }
}
