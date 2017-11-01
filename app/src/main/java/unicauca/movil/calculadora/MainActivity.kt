package unicauca.movil.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import unicauca.movil.calculadora.util.text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.setOnClickListener(this::operar)
        res.setOnClickListener(this::operar)
        mul.setOnClickListener(this::operar)
        div.setOnClickListener(this::operar)
    }

    fun operar(view: View) {
        val n1 = num1.text().toInt()
        val n2 = num2.text().toInt()

        val rta: Int = when (view.id) {
            R.id.sum -> n1 + n2
            R.id.res -> n1 - n2
            R.id.mul -> n1 * n2
            else -> n1 / n2
        }

        result.text = "$rta"
    }

}
