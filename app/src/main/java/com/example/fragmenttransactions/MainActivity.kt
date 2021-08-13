package com.example.fragmenttransactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var blankFragment = BlankFragment()

        btn_add.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.add(R.id.fragment_liner,blankFragment)
            transaction.addToBackStack(blankFragment.toString())
            transaction.commit()
        }
        btn_remove.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.remove(blankFragment)
            transaction.commit()
        }
        btn_replace.setOnClickListener {
            val blankFragment2 = BlankFragment2()
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_liner,blankFragment2)
            transaction.addToBackStack(blankFragment2.toString())
            transaction.commit()
        }
        btn_hide.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.hide(blankFragment)
            transaction.commit()
        }
        btn_show.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.show(blankFragment)
            transaction.commit()
        }

    }
}