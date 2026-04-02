import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class QuranViewModel extends ViewModel {

    private final MutableLiveData<List<String>> surahList;
    private final MutableLiveData<String> selectedSurah;
    private final MutableLiveData<List<String>> ayahList;
    private final MutableLiveData<Boolean> isLoading;
    private final MutableLiveData<String> errorMessage;

    public QuranViewModel() {
        surahList = new MutableLiveData<>();
        selectedSurah = new MutableLiveData<>();
        ayahList = new MutableLiveData<>();
        isLoading = new MutableLiveData<>(false);
        errorMessage = new MutableLiveData<>();
        initializeMockData();
    }

    private void initializeMockData() {
        List<String> mockSurahs = new ArrayList<>();
        mockSurahs.add("Al-Fatiha");
        mockSurahs.add("Al-Baqarah");
        // Add more mock data as necessary

        surahList.setValue(mockSurahs);
    }

    public LiveData<List<String>> getSurahList() {
        return surahList;
    }

    public LiveData<String> getSelectedSurah() {
        return selectedSurah;
    }

    public LiveData<List<String>> getAyahList() {
        return ayahList;
    }

    public LiveData<Boolean> isLoading() {
        return isLoading;
    }

    public LiveData<String> getErrorMessage() {
        return errorMessage;
    }

    public void selectSurah(String surah) {
        selectedSurah.setValue(surah);
        // Logic to load Ayah list for the selected Surah can be added here
    }
}
