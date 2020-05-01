package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_league
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
 var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }
    fun onCoEdClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

        fun leagueNextClicked(view : View){
            if (selectedLeague != ""){
                val skillActivity = Intent(this,
                    SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_league,selectedLeague)
                startActivity(skillActivity)
            }
           else{
                Toast.makeText(this, "Please select a league!",Toast.LENGTH_SHORT).show()

            }
        }

}
