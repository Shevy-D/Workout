package com.shevy.workout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    companion object {
    val EXTRA_WORKOUT_ID: String = "id"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val frag: WorkoutDetailFragment = supportFragmentManager.findFragmentById(R.id.detail_frag) as WorkoutDetailFragment
        val workoutId = intent.extras!![EXTRA_WORKOUT_ID] as Int
        frag.setWorkout(workoutId.toLong())
    }
}