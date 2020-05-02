package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.swoosh.R
import com.example.swoosh.Utilities.extra_player
import com.example.swoosh.toggle.Player

import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
   lateinit var  player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
       player = intent.getParcelableExtra(extra_player)

    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }
    fun onSkillFinishClicked  (view: View){
        if (player.skill != ""){
        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(extra_player,player)

        startActivity(finishActivity)}
        else{
            Toast.makeText(this,"Please select a level!", Toast.LENGTH_SHORT).show()
        }
    }
}
