package roberto.molina.calculadorafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var total: Long = 0
    var validacion = true
    var operacion = ""

    fun ingresarNum(numero: String){
        var txtOpe: TextView = findViewById(R.id.txtOpe)
        if (txtOpe.text == "0"){
            txtOpe.text = numero
        }
        else{
            txtOpe.text = ""+txtOpe.text+numero
        }

        validacion = true
    }

    fun historial(){
        var txtHis: TextView = findViewById(R.id.txtHis)
        var txtOpe: TextView = findViewById(R.id.txtOpe)
        if (validacion){
            txtHis.text = ""+txtHis.text+txtOpe.text+operacion
            validacion = false
            txtOpe.text = "0"
        }
    }

    fun operacion(){
        var txtOpe: TextView = findViewById(R.id.txtOpe)
        if (total.toInt() == 0){
            total = txtOpe.text.toString().toLong()
        }
        else{
            when(operacion){
                "+" -> total += txtOpe.text.toString().toLong()
                "-" -> total -= txtOpe.text.toString().toLong()
                "*" -> total *= txtOpe.text.toString().toLong()
                "/" ->  if (txtOpe.text=="0") {
                    var txtHis: TextView = findViewById(R.id.txtHis)
                    var txtOpe: TextView = findViewById(R.id.txtOpe)
                    txtHis.text = ""
                    txtOpe.text = "no se puede dividir por 0"
                    operacion = ""
                    total = 0
                    validacion = true
                }
                else {
                    total /=txtOpe.text.toString().toLong()
                }
            }
        }
    }

    fun clickNum0(view: View){
        ingresarNum("0")
    }

    fun clickNum1(view: View){
        ingresarNum("1")
    }

    fun clickNum2(view: View){
        ingresarNum("2")
    }

    fun clickNum3(view: View){
        ingresarNum("3")
    }

    fun clickNum4(view: View){
        ingresarNum("4")
    }

    fun clickNum5(view: View){
        ingresarNum("5")
    }

    fun clickNum6(view: View){
        ingresarNum("6")
    }

    fun clickNum7(view: View){
        ingresarNum("7")
    }

    fun clickNum8(view: View){
        ingresarNum("8")
    }

    fun clickNum9(view: View){
        ingresarNum("9")
    }

    fun sumar(view: View){
        operacion()
        if (validacion) {
            operacion = "+"
        }
        historial()
    }

    fun restar(view: View){
        operacion()
        if (validacion) {
            operacion = "-"
        }
        historial()
    }

    fun multiplicar(view: View){
        operacion()
        if (validacion) {
            operacion = "*"
        }
        historial()
    }

    fun division(view: View){
        operacion()
        if (validacion) {
            operacion = "/"
        }
        historial()
    }

    fun igual(view: View,){
        operacion()
        var txtHis: TextView = findViewById(R.id.txtHis)
        var txtOpe: TextView = findViewById(R.id.txtOpe)
        if (validacion){
            txtHis.text = ""+txtHis.text+txtOpe.text+operacion
            txtOpe.text = total.toString()
            txtHis.text = ""
            operacion = ""
            total = 0
        }
    }

    fun borrar(view: View){
        var txtHis: TextView = findViewById(R.id.txtHis)
        var txtOpe: TextView = findViewById(R.id.txtOpe)
        txtHis.text = ""
        txtOpe.text = "0"
        operacion = ""
        total = 0
        validacion = true

    }
}