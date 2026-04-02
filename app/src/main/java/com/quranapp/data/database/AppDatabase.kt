import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase

@Entity(tableName = "prayers")
data class Prayer(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val time: String
)

@Entity(tableName = "bookmarks")
data class Bookmark(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val verseId: Long,
    val note: String
)

@Entity(tableName = "verse_of_day")
data class VerseOfDay(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val verse: String,
    val date: String
)

@Database(entities = [Prayer::class, Bookmark::class, VerseOfDay::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    // Define DAOs here
}