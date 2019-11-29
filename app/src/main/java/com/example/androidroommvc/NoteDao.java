package com.example.androidroommvc;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


//What is DATA ACCESS OBJECT (DAO) - It is a object/interface,
// which is used to access data from database of data storage.
// WHY WE USE DAO: it abstracts the retrieval of data from a data resource such as a database
@Dao
public interface NoteDao {



    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    //Livedata shows the realtime updated data ..activity will be notified
    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
