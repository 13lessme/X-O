package com.example.x_o

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Res.setOnClickListener {
            Toast.makeText(this, "Новая игра", Toast.LENGTH_LONG).show()
            Res.isEnabled = true
            But1.isEnabled = true; But1.text = ""
            But2.isEnabled = true; But2.text = ""
            But3.isEnabled = true; But3.text = ""
            But4.isEnabled = true; But4.text = ""
            But5.isEnabled = true; But5.text = ""
            But6.isEnabled = true; But6.text = ""
            But7.isEnabled = true; But7.text = ""
            But8.isEnabled = true; But8.text = ""
            But9.isEnabled = true; But9.text = ""

        }
        switch1.setOnClickListener {
            if(switch1.isEnabled == false){

            }
        }


        var Turn: Boolean
        var X: Int = 0
        var O: Int = 0
        var X2: Int = 0
        var O2: Int = 0

        fun check(){
            //ничья
            if(But1.isEnabled == false && But2.isEnabled == false &&  But3.isEnabled == false &&  But4.isEnabled == false &&  But5.isEnabled == false &&  But6.isEnabled == false &&  But7.isEnabled == false &&  But8.isEnabled == false &&  But9.isEnabled == false )
                Toast.makeText(this, "Ничья", Toast.LENGTH_LONG).show()
            //Горизонталь
            if (But1.text == But2.text && But2.text == But3.text)
                if (But1.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But1.text}", Toast.LENGTH_LONG).show()
                }
            if (But4.text == But5.text && But5.text == But6.text)
                if (But4.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But4.text}", Toast.LENGTH_LONG).show()
                }
            if (But7.text == But8.text && But8.text == But9.text)
                if (But7.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But7.text}", Toast.LENGTH_LONG).show()
                }
            //Вертикаль
            if (But1.text == But4.text && But4.text == But7.text)
                if (But1.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But1.text}", Toast.LENGTH_LONG).show()
                }
            if (But2.text == But5.text && But5.text == But8.text)
                if (But2.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But2.text}", Toast.LENGTH_LONG).show()
                }
            if (But3.text == But6.text && But6.text == But9.text)
                if (But3.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But3.text}", Toast.LENGTH_LONG).show()
                }
            //Диагонали
            if (But1.text == But5.text && But5.text == But9.text)
                if (But1.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But1.text}", Toast.LENGTH_LONG).show()
                }
            if (But3.text == But5.text && But5.text == But7.text)
                if (But3.text != ""){
                    But1.isEnabled = false; But2.isEnabled = false; But3.isEnabled = false; But4.isEnabled = false; But5.isEnabled = false; But6.isEnabled = false; But7.isEnabled = false; But8.isEnabled = false; But9.isEnabled = false
                    Toast.makeText( this, "Победа ${But3.text}", Toast.LENGTH_LONG).show()
                }

        }

        Turn = true
        But1.setOnClickListener {
            if (Turn) But1.text = "O"
            else But1.text = "X"
            Turn = !Turn
            But1.isEnabled = false
            check()
        }
        But2.setOnClickListener {
            if (Turn) But2.text = "O"
            else But2.text = "X"
            Turn = !Turn
            But2.isEnabled = false
            check()
        }
        But3.setOnClickListener {
            if (Turn) But3.text = "O"
            else But3.text = "X"
            Turn = !Turn
            But3.isEnabled = false
            check()
        }
        But4.setOnClickListener {
            if (Turn) But4.text = "O"
            else But4.text = "X"
            Turn = !Turn
            But4.isEnabled = false
            check()
        }
        But5.setOnClickListener {
            if (Turn) But5.text = "O"
            else But5.text = "X"
            Turn = !Turn
            But5.isEnabled = false
            check()
        }
        But6.setOnClickListener {
            if (Turn) But6.text = "O"
            else But6.text = "X"
            Turn = !Turn
            But6.isEnabled = false
            check()
        }
        But7.setOnClickListener {
            if (Turn) But7.text = "O"
            else But7.text = "X"
            Turn = !Turn
            But7.isEnabled = false
            check()
        }
        But8.setOnClickListener {
            if (Turn) But8.text = "O"
            else But8.text = "X"
            Turn = !Turn
            But8.isEnabled = false
            check()
        }
        But9.setOnClickListener {
            if (Turn) But9.text = "O"
            else But9.text = "X"
            Turn = !Turn
            But9.isEnabled = false
            check()
        }
    }

 }

