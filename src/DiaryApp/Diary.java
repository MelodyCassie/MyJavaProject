package DiaryApp;
import DiaryApp.exceptions.DiaryIsLockedError;
import DiaryApp.exceptions.EmptyInputError;
import DiaryApp.exceptions.EntryNotFoundError;
import DiaryApp.exceptions.PasswordError;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final String username;
    private final String password;
    private boolean isLocked = true;
    private List<Entry> entries;
    private List<Diary> diaries;
    private int entrySizeTrack;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        entries = new ArrayList<>();
        diaries = new ArrayList<>();
    }

    public void unlockDiary(String myPassword) {
        passwordValidation(myPassword);
        isLocked = false;

    }

    public void passwordValidation(String myPassword) {
        if (!this.password.equals(myPassword))
            throw new PasswordError("Invalid Username or Password.");
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void createEntry(String myDiaryTitle, String myDiaryBody) {
        diaryIsLockedError();
        emptyInputError(myDiaryTitle,myDiaryBody);
        entrySizeTrack++;
        Entry myEntry = new Entry(generateEntryId(),myDiaryTitle,myDiaryBody);
        myEntry.setDateCreated(LocalDateTime.now());
        entries.add(myEntry);

    }

    public void diaryIsLockedError(){
        if(isLocked) {
            throw new DiaryIsLockedError("Diary is locked!.");
        }
    }
    public void emptyInputError(String myDiaryTitle, String myDiaryBody){
        if(myDiaryTitle.trim().isEmpty() || myDiaryBody.trim().isEmpty()){
            throw new EmptyInputError("Why???");
        }
    }
    public int generateEntryId(){
        return Integer.parseInt(10 + "" + entrySizeTrack);

    }

    public int getEntrySize() {
        return entries.size();
    }

    public void deleteEntry(int id) {
       entries.remove(findEntryId(id));
    }

    public Entry findEntryId(int id) {
        diaryIsLockedError();
        for(Entry entry : entries){
            if(entry.getId() == id)
                return entry;
        }
        throw new EntryNotFoundError("Entry ID not found.");
    }

    public void updateEntry(int id, String myDiaryTitle, String myDiaryBody) {
        diaryIsLockedError();
        emptyInputError("myDiaryTitle","myDiaryBody");

        Entry entry = findEntryId(id);
        String message = entry.getBody() + " " + myDiaryBody;
        entry.setTitle(myDiaryTitle);
        entry.setBody(myDiaryBody);

    }
}