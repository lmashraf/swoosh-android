package org.uhworks.swoosh.Controller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import org.uhworks.swoosh.Models.Player
import org.uhworks.swoosh.R
import org.uhworks.swoosh.Utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        // Get the intent's extra value from key
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        // Change value of the text field depending on the values of previous extras
        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
