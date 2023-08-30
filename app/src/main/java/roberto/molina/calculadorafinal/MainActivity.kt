package roberto.molina.calculadorafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
var total: Int = 0

fun pressDigit1(view: View){
    var txt2: TextView = findViewById(R.id.txt2)
    txt2.text = txt2.text.toString() + 1
}

fun pressDigit2(view: View){
    var txt2: TextView = findViewById(R.id.txt2)
    txt2.text = txt2.text.toString() + 2
}

fun pressDigitSum(view: View){
    var txt1: TextView = findViewById(R.id.txt1)
    var txt2: TextView = findViewById(R.id.txt2)

    total += txt2.text.toString().toInt()

    txt1.text = txt1.text.toString() + txt2.text.toString() + "+"
    txt2.text = ""
}

fun pressDigitEqual(view: View){
    var txt1: TextView = findViewById(R.id.txt1)
    var txt2: TextView = findViewById(R.id.txt2)

    total += txt2.text.toString().toInt()

    txt1.text = txt1.text.toString() + txt2.text.toString() + "+"
    txt2.text = total.toString()
}

fun pressDigitC(view: View){
    var txt1: TextView = findViewById(R.id.txt1)
    var txt2: TextView = findViewById(R.id.txt2)

    total = 0

    txt1.text = ""
    txt2.text = ""
}