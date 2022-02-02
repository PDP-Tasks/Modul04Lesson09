package dev.matyaqubov.modul04lesson09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var lottie: LottieAnimationView
    private lateinit var buttonTask1:Button
    private lateinit var buttonTask2:Button
    private lateinit var buttonTask3:Button
    private lateinit var buttonTask4:Button
    private lateinit var buttonTask5:Button
    private lateinit var buttonTask6:Button
    private lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        buttonTask1=findViewById(R.id.task1)
        buttonTask2=findViewById(R.id.task2)
        buttonTask3=findViewById(R.id.task3)
        buttonTask4=findViewById(R.id.task4)
        buttonTask5=findViewById(R.id.task5)
        buttonTask6=findViewById(R.id.task6)

        buttonTask1.setOnClickListener(this)
        buttonTask2.setOnClickListener(this)
        buttonTask3.setOnClickListener(this)
        buttonTask4.setOnClickListener(this)
        buttonTask5.setOnClickListener(this)
        buttonTask6.setOnClickListener(this)

        lottie=findViewById(R.id.my_lottie)
        image=findViewById(R.id.img_anim)


    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.task1 -> {
                val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
                image.startAnimation(animation)
            }
            R.id.task2 -> {
                val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)
                image.startAnimation(animation)
            }
            R.id.task3 -> {
                val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.together)
                image.startAnimation(animation)
            }
            R.id.task4 -> {
                lottie.setAnimation("facebook.json")
                lottie.playAnimation()
            }
            R.id.task5 -> {
                lottie.setAnimation("youtube.json")
                lottie.playAnimation()
            }
            R.id.task6 -> {
                lottie.setAnimation("twitter.json")
                lottie.playAnimation()
            }
        }
    }
}