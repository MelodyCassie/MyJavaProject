package DiaryApp;

import DiaryApp.exceptions.DiaryNotFoundError;
import DiaryApp.exceptions.UsernameAlreadyExistError;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List <Diary> diaries;

    public Diaries() {
        diaries = new ArrayList<>();
    }

    public void add(String username, String password){
        for(Diary diary : diaries){
            if(diary.getUsername().contains(username)) throw new UsernameAlreadyExistError("Username Already Exists.\n Enter your username.." );

            Diary melDiary = new Diary("mel", "melly888");
            diaries.add(diary);

        }
    }
    public int getSizeOfDiaries(){
        return diaries.size();
    }

    public Diary findByUsername(String username){
     for (Diary diary : diaries)  {
         if(diary.getUsername() .equals(username)){
             return diary;
         }
     }
     throw new DiaryNotFoundError("Diary does not exist");

    }

    public void deleteDiary(String username, String password){

        Diary  diaryToDelete = null;

        for(Diary diary : diaries){
            if(diary.getUsername().equals(username)&&diary.getPassword().equals(password)) diaryToDelete = diary;

            break;


        }
        if(diaryToDelete != null){
            diaries.remove(diaryToDelete);
        }
        else {
            throw new DiaryNotFoundError("Diary does not exist.");
        }

    }

}
