package com.hoangthang.duolingo

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity constructor() : AppCompatActivity() {
    var btnKiemtra: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var pbChay: ProgressBar? = null
    var choose: Int = 0
    var textView2: TextView? = null
    var textView3: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnKiemtra = findViewById<View>(R.id.buttonKiemtra) as Button?
        button2 = findViewById<View>(R.id.button2) as Button?
        button3 = findViewById<View>(R.id.button3) as Button?
        button4 = findViewById<View>(R.id.button4) as Button?
        textView2 = findViewById<View>(R.id.textView2) as TextView?
        textView3 = findViewById<View>(R.id.textView3) as TextView?
        pbChay = findViewById<View>(R.id.progressBar) as ProgressBar?
        btnKiemtra!!.setOnClickListener(object : View.OnClickListener {
            public override fun onClick(v: View): Unit {
                var current: Int = pbChay!!.getProgress()
                pbChay!!.setProgress(40.also({ current = it }))
            }
        })
        button2!!.setOnClickListener((object : View.OnClickListener {
            public override fun onClick(v: View): Unit {
                btnKiemtra!!.setBackgroundResource(R.drawable.blue)
                //button2.setBackgroundColor(Color.parseColor("gray"));
                button3!!.setBackgroundResource(R.drawable.duongvien_goctron)
                button4!!.setBackgroundResource(R.drawable.duongvien_goctron)
                choose = 2
                textView2!!.setVisibility(View.INVISIBLE)
                textView3!!.setVisibility(View.INVISIBLE)
                button2!!.setBackgroundResource(R.drawable.xanh)
            }
        }))
        button3!!.setOnClickListener((object : View.OnClickListener {
            public override fun onClick(v: View): Unit {
                btnKiemtra!!.setBackgroundResource(R.drawable.blue)
                button3!!.setBackgroundResource(R.drawable.xanh)
                button2!!.setBackgroundResource(R.drawable.duongvien_goctron)
                button4!!.setBackgroundResource(R.drawable.duongvien_goctron)
                choose = 3
                textView2!!.setVisibility(View.INVISIBLE)
                textView3!!.setVisibility(View.INVISIBLE)
            }
        }))
        button4!!.setOnClickListener((object : View.OnClickListener {
            public override fun onClick(v: View): Unit {
                btnKiemtra!!.setBackgroundResource(R.drawable.blue)
                button4!!.setBackgroundResource(R.drawable.xanh)
                button3!!.setBackgroundResource(R.drawable.duongvien_goctron)
                button2!!.setBackgroundResource(R.drawable.duongvien_goctron)
                choose = 4
                textView2!!.setVisibility(View.INVISIBLE)
                textView3!!.setVisibility(View.INVISIBLE)
            }
        }))
        btnKiemtra!!.setOnClickListener(object : View.OnClickListener {
            public override fun onClick(v: View): Unit {
                btnKiemtra!!.setBackgroundResource(R.drawable.blue)
                if (choose == 4) {
                    textView2!!.setVisibility(View.VISIBLE)
                    textView3!!.setVisibility(View.INVISIBLE)
                    pbChay!!.setProgress(pbChay!!.getProgress() + 10)
                } else {
                    textView3!!.setVisibility(View.VISIBLE)
                    textView2!!.setVisibility(View.INVISIBLE)
                }
            }
        })
    }
}