package me.codeenzyme.simplecalcultor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var principalEditText: EditText
    lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        principalEditText = findViewById(R.id.principal_amt)
        resultView = findViewById(R.id.simple_interest_result_view)

    }

    fun calculate(view: View) {
        val principal = principalEditText.text.toString().toDouble()
        resultView.text = SimpleInterestCalculator().calculateInterest(principal).toString()
    }
}