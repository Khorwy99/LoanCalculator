package com.example.loancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate.setOnClickListener() {

            val carValue = priceValue.text.toString()
            val downValue = paymentValue.text.toString()
            val carLoan:Double = carValue.toDouble() - downValue.toDouble()

            outputLoan.text = "%.2f".format(carLoan)

            val interest = interestValue.text.toString()
            val loanPeriodValue = loanValue.text.toString()

            val interestAmount:Double = carLoan.toDouble() * interest.toDouble() * loanPeriodValue.toDouble()

            outputInterest.text = "%.2f".format(interestAmount)

            val monthlyRepayment:Double = (carLoan.toDouble() + interest.toDouble())/ loanPeriodValue.toDouble() / 12

            outputRepayment.text = "%.2f".format(monthlyRepayment)


        }
    }
}
