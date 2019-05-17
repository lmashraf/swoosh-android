package org.uhworks.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        startBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)

            startActivity(leagueIntent)
        }
    }
}
