import android.app.AlarmManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log

class PrayerReminderService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Schedule notifications based on prayer times
        schedulePrayerNotifications()
        return START_STICKY
    }

    private fun schedulePrayerNotifications() {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Define the time for each prayer here
        // Example for Fajr prayer
        val fajrTimeInMillis: Long = // Convert your prayer time to milliseconds

        // Set up the PendingIntent for the notification
        val intent = Intent(this, NotificationReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        // Set the alarm for the specified prayer time
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, fajrTimeInMillis, pendingIntent)

        Log.d("PrayerReminderService", "Prayer notifications scheduled.")
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}