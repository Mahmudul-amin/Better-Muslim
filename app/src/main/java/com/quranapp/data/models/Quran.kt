data class Surah(val number: Int, val name: String, val englishName: String, val englishNameTranslation: String, val revelationType: String, val versesCount: Int)

data class Ayah(val number: Int, val text: String, val surahNumber: Int, val numberInSurah: Int)

data class Translation(val language: String, val text: String)