package com.example.imadpracticum_st10456573_caitlynjeniker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days

class MainActivity2 : AppCompatActivity() {
    private fun addWeatherAppdata() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lateinit  var Day: EditText
        lateinit  var maxTemp: EditText
        lateinit  var minTemp: EditText
        lateinit  var WeatherCondition: EditText

        val weatherAppData = mutableListOf<Map<String, Any>>()

        Day = findViewById(R.id.editTextText)
        maxTemp= findViewById(R.id.editTextNumber)
        minTemp= findViewById(R.id.editTextNumber2)
        weatherCondition= findViewById(R.id.editTextText2)

        val button3 = this.findViewById<Any>(R.id.button3)
        val button4: = findViewById(R.id.button4)

        button3.setOnClickListener {

            addWeatherAppdata()

        }

        button4.setOnClickListener {
            val intent = Intent(this, detailed_view_screen: : class.java)
            intent.putExtra(“weatherAppData”, ArrayList(weatherAppData))

            startActivity(intent)

        }

    }

    private fun clearInputField() {
        val Day = Day.text.toString()
        val maxTemp= maxTemp.text.toString().toIntOrNull() ?: 0
        val minTemp = minTemp.text.toString().toIntOrNull() ?: 0

        if (Days.isNotEmpty() && (maxTemp > 0 || minTemp> 0)) {

            val entry = mapOf(
                “day” to day,
            “maxTemp” to MaxTemp,
            “minTemp” to MinTemp,
            “weatherCondition” to WeatherConditions
            addWeatherAppdata.add(entry)
            clearInputField()

        }

    }

    Private fun clearInputFields() {

        Day.text.clear()
        MaxTemp.text.clear()
        MinTemp.text.clear()
        WeatherCondition.text.clear()

    }

}


