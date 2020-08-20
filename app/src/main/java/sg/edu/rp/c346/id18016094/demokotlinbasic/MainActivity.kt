package sg.edu.rp.c346.id18016094.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            var userDOB = etDOB.text.toString()
            if (userDOB.isNotEmpty()) {

                var year = Calendar.getInstance().get(Calendar.YEAR)
                var age = year - userDOB.toInt()

                var output = ""
                /*
                //if else
                if (age < 18) {
                    output = "Underage"
                } else if (age in 18..65) {
                    output = "Young people"
                } else if (age in 66..79) {
                    output = "Middle-aged"
                } else if (age in 80..99) {
                    output = "Elderly"
                } else {
                    output = "Long-lived elderly"
                }
                 */
                // when expression
                when (age) {
                    in 0..17 -> output = "Underage"
                    in 18..65 -> output = "Young people"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                    else -> {
                        output = "Long-lived elderly"
                    }
                }
                tvShowAge.text = "Your age is $age"
                tvOutput.text = "$output"
            } else {
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
