package com.gbc.a2101015020.db.dao;
import android.arch.persistence.room.*;
import com.gbc.a2101015020.db.Nurse;
import java.util.List;

/**
 * Created on 11/17/2017.
 */
@Dao
public interface NurseDao {
        @Query("SELECT * FROM Nurse")
        List<Nurse> getAll();

        @Insert
        void insertAll(Nurse... nurses);

        @Query("DELETE FROM nurse")
        void nukeTable();

        @Update
        void updateNurses(Nurse... nurses);

        @Delete
        void delete(Nurse... nurses);
}
