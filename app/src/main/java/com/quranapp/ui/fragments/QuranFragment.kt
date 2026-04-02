import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.quranapp.R
import com.quranapp.data.Surah
import com.quranapp.data.QuranData

class QuranFragment : Fragment() {

    private lateinit var surahListView: ListView
    private lateinit var surahAdapter: SurahAdapter

    override fun onCreateView(
        inflater: LayoutInflater, 
        container: ViewGroup?, 
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quran, container, false)
        surahListView = view.findViewById(R.id.surahListView)
        initSurahList()  
        return view
    }

    private fun initSurahList() {
        val surahs: List<Surah> = QuranData.getSurahs() // Method to get Surahs list
        surahAdapter = SurahAdapter(requireContext(), surahs)
        surahListView.adapter = surahAdapter
        surahListView.setOnItemClickListener { _, _, position, _ ->
            displayAyahs(surahs[position])
        }
    }

    private fun displayAyahs(surah: Surah) {
        // Logic to display Ayahs of the selected Surah
    }
}