package org.uhworks.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import org.uhworks.swoosh.Models.Player
import org.uhworks.swoosh.R
import org.uhworks.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    private var player = Player("", "")

    // Save instance state after an orientation change
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        // Save state of player instance
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    // Restore instance state after an orientation change
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        // If we already have an instance state saved
        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // ToggleButton: Men's
    fun onMensClicked(view: View) {

        // Uncheck others
        womenBtn.isChecked = false
        coedBtn.isChecked = false

        // Set League
        player.league = "mens"
    }

    // ToggleButton: Women's
    fun onWomensClicked(view:View) {

        // Uncheck others
        menBtn.isChecked = false
        coedBtn.isChecked = false

        // Set League
        player.league = "womens"
    }

    // ToggleButton: Co-Ed's
    fun onCoedClicked(view: View) {

        // Uncheck others
        menBtn.isChecked = false
        womenBtn.isChecked = false

        // Set League
        player.league = "co-ed"
    }

    // Button: Next
    fun leagueNextClicked(view: View) {

        if( player.league != "" ) {
            // Create Intent
            val skillActivity = Intent(this, SkillActivity::class.java)

            // Add Extra as key,value to pass to the next Activity
            skillActivity.putExtra(EXTRA_PLAYER, player)

            // Start Activity
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}
