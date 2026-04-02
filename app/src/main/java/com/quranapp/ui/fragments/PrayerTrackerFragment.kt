package com.quranapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quranapp.R
import com.quranapp.model.PrayerDetail

class PrayerTrackerFragment : Fragment() {

    private lateinit var prayerRecyclerView: RecyclerView
    private lateinit var prayerList: List<PrayerDetail>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_prayer_tracker, container, false)
        prayerRecyclerView = view.findViewById(R.id.recyclerViewPrayer)
        prayerList = getPrayerHistory()  // Fetch the prayer history
        setupRecyclerView()
        return view
    }

    private fun setupRecyclerView() {
        prayerRecyclerView.layoutManager = LinearLayoutManager(context)
        prayerRecyclerView.adapter = PrayerAdapter(prayerList)
    }

    private fun getPrayerHistory(): List<PrayerDetail> {
        // Placeholder for fetching prayer history
        return listOf(
            PrayerDetail("Fajr", "2026-04-01 05:00:00"),
            PrayerDetail("Dhuhr", "2026-04-01 12:00:00"),
            PrayerDetail("Asr", "2026-04-01 15:30:00"),
            PrayerDetail("Maghrib", "2026-04-01 18:45:00"),
            PrayerDetail("Isha", "2026-04-01 20:00:00")
        )
    }
} 

class PrayerAdapter(private val prayerList: List<PrayerDetail>) : RecyclerView.Adapter<PrayerAdapter.PrayerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_prayer, parent, false)
        return PrayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PrayerViewHolder, position: Int) {
        val prayer = prayerList[position]
        holder.bind(prayer)
    }

    override fun getItemCount(): Int = prayerList.size

    class PrayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(prayer: PrayerDetail) {
            // Bind prayer data to UI elements here
        }
    }
} 

data class PrayerDetail(val name: String, val time: String)