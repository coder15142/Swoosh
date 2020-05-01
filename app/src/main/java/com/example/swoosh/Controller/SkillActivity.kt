package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_league
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_skill
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
   var league = ""
    var skill =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_league)

    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }
    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }
    fun onSkillFinishClicked  (view: View){
        if (skill != ""){
        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(EXTRA_skill,skill)
        finishActivity.putExtra(EXTRA_league,league)
        startActivity(finishActivity)}
        else{
            Toast.makeText(this,"Please select a level!", Toast.LENGTH_SHORT).show()
        }
    }
}
