package org.uhworks.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.uhworks.swoosh.Models.Player
import org.uhworks.swoosh.R
import org.uhworks.swoosh.Utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    // Read extra
    private lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // Get the intent's extra value from key
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    // Button: Finish
    fun onSkillFinishClicked(view: View) {

        if(player.skill!= "") {
            // Create Intent
            val finishActivity = Intent(this, FinishActivity::class.java)

            // Add Extra as key,value to pass to the next Activity
            finishActivity.putExtra(EXTRA_PLAYER, player)

            // Start Activity
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

    // Toggle Button: Baller
    fun onBallerClicked(view: View) {

        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    // Toggle Button: Beginner
    fun onBeginnerClicked(view: View){

        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }
}
