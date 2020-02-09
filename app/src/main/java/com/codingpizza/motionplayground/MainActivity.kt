package com.codingpizza.motionplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use in case you want to end a transition after 3 seconds
//        val result = GlobalScope.launch {
//            delay(3000)
//            Log.d("MainActivity", "Terminado Delay")
//        }
//        result.invokeOnCompletion {
//            motion_container.transitionToEnd()
//        }

        yellowButton.setOnClickListener {

            if (motion_container.currentState == motion_container.endState){
                motion_container.transitionToState(R.id.start)
            } else {
                motion_container.transitionToState(R.id.end)
            }
        }

        greenButton.setOnClickListener {
            if (motion_container.currentState == motion_container.endState){
                motion_container.transitionToState(R.id.start)
            } else {
                motion_container.transitionToState(R.id.down)
            }
        }
    }
}
