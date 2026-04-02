package com.quranapp.data.models

data class PrayerRecord(
    val prayerName: String,
    val prayerTime: String,
    val isPrayed: Boolean
)

data class PrayerTime(
    val fajr: String,
    val dhuhr: String,
    val asr: String,
    val maghrib: String,
    val isha: String
)

data class DailyPrayerTracker(
    val date: String,
    val records: List<PrayerRecord>
)