import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Delete;
import java.util.List;

@Dao
public interface PrayerDao {
    @Insert
    void insert(Prayer prayer);

    @Update
    void update(Prayer prayer);

    @Delete
    void delete(Prayer prayer);

    @Query("SELECT * FROM prayers")
    List<Prayer> getAllPrayers();

    @Query("SELECT * FROM prayers WHERE id = :prayerId")
    Prayer getPrayerById(int prayerId);
}