package com.quranapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class VerseOfDayFragment : Fragment() {
 
    private lateinit var verseTextView: TextView
    private lateinit var hadithTextView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_verse_of_day, container, false)
        verseTextView = view.findViewById(R.id.verseTextView)
        hadithTextView = view.findViewById(R.id.hadithTextView)
        displayDailyVerseAndHadith()
        return view
    }

    private fun displayDailyVerseAndHadith() {
        // Assuming the verse and hadith are hardcoded for example purposes
        val dailyVerse = "In the name of Allah, the Most Gracious, the Most Merciful."
        val dailyHadith = "The best among you are those who have the best manners and character."

        verseTextView.text = dailyVerse
        hadithTextView.text = dailyHadith
    }
}
