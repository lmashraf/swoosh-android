package org.uhworks.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import org.uhworks.swoosh.Utilities.EXTRA_LEAGUE
import org.uhworks.swoosh.R

class LeagueActivity : BaseActivity() {

    var league = ""

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
        league = "mens"
    }

    // ToggleButton: Women's
    fun onWomensClicked(view:View) {

        // Uncheck others
        menBtn.isChecked = false
        coedBtn.isChecked = false

        // Set League
        league = "womens"
    }

    // ToggleButton: Co-Ed's
    fun onCoedClicked(view: View) {

        // Uncheck others
        menBtn.isChecked = false
        womenBtn.isChecked = false

        // Set League
        league = "co-ed"
    }

    // Button: Next
    fun leagueNextClicked(view: View) {

        if( league != "" ) {
            // Create Intent
            val skillActivity = Intent(this, SkillActivity::class.java)

            // Add Extra as key,value to pass to the next Activity
            skillActivity.putExtra(EXTRA_LEAGUE, league )

            // Start Activity
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}
