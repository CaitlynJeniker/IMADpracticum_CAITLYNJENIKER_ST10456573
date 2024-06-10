package com.example.imadpracticum_st10456573_caitlynjeniker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow

class detailed_view_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)


        val tableLayout: TableLayout = findViewById(R.id.tableLayout)
        val btnBack: Button = findViewById(R.id.button6)
        val clear: Button = findViewById(R.id.button5)

        val weatherAppData = intent.getSerializableExtra("  addWeatherAppdata")as Arraylist<Map<String, Any>>

        populateSummaryTable(tableLayout, weatherAppData)

        clear.setOnClickListener{
            tabaleLayout.removeAllViews()
        }

        btnBack.setOnClickListener{
            val intent = Intent(this, MainActivity2: :java)
            startActivity(intent)
        }
    }
    private fun populateSummaryTable(tableLayout: TableLayout, weatherAppData,: List<Map<String, Any>>) {
        val headRow = TableRow(this)
        headerRow.addView(CreateTextView("Day"))
        headerRow.addView(CreateTextView("maxTemp"))
        headerRow.addView(CreateTextView("minTemp"))
        headerRow.addView(CreateTextView("weatherConditions"))
        tableLayout.addview(headRow)

        weatherAppData.forEach{ entry ->
            val row = TableRow(this)
            row.addView(CreateTextView(entry["Day"] as String))
            row.addView(CreateTextView(entry["maxTemp"] as String))
            row.addView(CreateTextView(entry["minTemp"] as String))
            row.addView(CreateTextView(entry["weatherConditions"] as String))
            tableLayout.addView(row)
        }
    }
}