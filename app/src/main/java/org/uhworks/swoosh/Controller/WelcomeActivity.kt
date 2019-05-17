package org.uhworks.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*
import org.uhworks.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        startBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)

            startActivity(leagueIntent)
        }
    }
}
