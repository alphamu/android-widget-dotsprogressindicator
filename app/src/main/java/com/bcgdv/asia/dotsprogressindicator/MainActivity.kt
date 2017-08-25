package com.bcgdv.asia.dotsprogressindicator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.bcgdv.asia.lib.dots.DotsProgressIndicator

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var dots1: DotsProgressIndicator? = null
    var dots2: DotsProgressIndicator? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btnToggle)
        dots1 = findViewById(R.id.dotsProgressIndicatorView)
        dots2 = findViewById(R.id.dotsProgressIndicatorView2)
        btn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (dots1?.visibility == View.VISIBLE) {
            dots1?.visibility = View.GONE
            dots2?.visibility = View.GONE
        } else {
            dots1?.visibility = View.VISIBLE
            dots2?.visibility = View.VISIBLE
        }
    }

}
