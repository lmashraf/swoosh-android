package org.uhworks.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // Get the intent's extra value from key
        league = intent.getStringExtra(EXTRA_LEAGUE)

        println(league)
    }
}
