package unicauca.movil.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSum, btnRes, btnMul, btnDiv;
    TextView result;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum =  findViewById(R.id.sum);
        btnRes = findViewById(R.id.res);
        btnMul = findViewById(R.id.mul);
        btnDiv = findViewById(R.id.div);

        num1 =  findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        result = findViewById(R.id.result);

        btnSum.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnRes.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String nS1 = num1.getText().toString();
        String nS2 =  num2.getText().toString();
        int n1 = Integer.parseInt(nS1);
        int n2 = Integer.parseInt(nS2);
        int r = 0;

        switch (view.getId()){
            case R.id.sum: r = n1 + n2; break;
            case R.id.res: r = n1 - n2; break;
            case R.id.mul: r = n1 * n2; break;
            case R.id.div: r = n1 / n2; break;
        }
        result.setText(r+"");

    }
}
