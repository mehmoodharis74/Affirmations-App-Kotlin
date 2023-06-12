package com.example.affirmations.model

import com.example.affirmations.R

class DataSource {
    fun loadAffirmations(): List<AffirmationModel>{
        return listOf<AffirmationModel>(
            AffirmationModel(R.string.affirmation1, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation2, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation3, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation4, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation5, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation6, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation7, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation8, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation9, R.drawable.ic_launcher_background),
            AffirmationModel(R.string.affirmation10, R.drawable.ic_launcher_background)
        )
    }
}