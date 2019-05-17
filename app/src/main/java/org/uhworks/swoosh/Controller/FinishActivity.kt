package org.uhworks.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import org.uhworks.swoosh.R
import org.uhworks.swoosh.Utilities.EXTRA_LEAGUE
import org.uhworks.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        // Get the intent's extra value from key
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        // Change value of the text field depending on the values of previous extras
        searchLeaguesTxt.text = "Looking for $league $skill league near you..."
    }
}
