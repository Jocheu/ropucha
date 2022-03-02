package com.example.cosnowego


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.CheckBox
import java.lang.StringBuilder
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var czipsy: CheckBox
    lateinit var czoko: CheckBox
    lateinit var hotdog: CheckBox
    lateinit var cola: CheckBox
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "ropuch"
        czipsy = findViewById<CheckBox>(R.id.chkChips)
        czoko = findViewById<CheckBox>(R.id.chkChoco)
        hotdog = findViewById<CheckBox>(R.id.chkHotDog)
        cola = findViewById<CheckBox>(R.id.chkCola)
        btn = findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            var suma = 0
            val result = StringBuilder()
            result.append("Zaznaczone")
            if(czipsy.isChecked){
                result.append("\nChipsy 6 zł")
                suma+=6
            }
            if (czoko.isChecked){
                result.append("\nCzekolada 4 zł")
                suma+=4
            }
            if(hotdog.isChecked){
                result.append("\nHot dog 3 zł")
                suma+=3
            }
            if(cola.isChecked){
                result.append("\nCola 7zł")
                suma += 7
            }

            result.append("\nrazem: " + suma + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}