package org.uhworks.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.uhworks.swoosh.R
import org.uhworks.swoosh.Utilities.*

class SkillActivity : BaseActivity() {

    // Read extra
    var league = ""

    // Write extra
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // Get the intent's extra value from key
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    // Button: Finish
    fun onSkillFinishClicked(view: View) {

        if(skill != "") {
            // Create Intent
            val finishActivity = Intent(this, FinishActivity::class.java)

            // Add Extra as key,value to pass to the next Activity
            finishActivity.putExtra(EXTRA_SKILL, skill)
            finishActivity.putExtra(EXTRA_LEAGUE, league)

            // Start Activity
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

    // Toggle Button: Baller
    fun onBallerClicked(view: View) {

        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    // Toggle Button: Beginner
    fun onBeginnerClicked(view: View){

        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }
}
