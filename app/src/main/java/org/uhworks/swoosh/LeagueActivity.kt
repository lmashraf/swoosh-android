package org.uhworks.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {

        // Create Intent
        val skillActivity = Intent(this, SkillActivity::class.java)

        // Start Activity
        startActivity(skillActivity)
    }
}
