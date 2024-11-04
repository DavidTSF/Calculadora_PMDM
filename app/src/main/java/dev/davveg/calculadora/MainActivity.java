package dev.davveg.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private boolean hasCalculated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void onNumberButtonClick ( View v ) {
        TextView tv = findViewById(R.id.outputScreen);
        if (hasCalculated) {
            tv.setText("");
            hasCalculated = false;
        }



        Button button = findViewById(v.getId());
        String t = tv.getText().toString() + button.getText().toString() ;

        tv.setText(  t );

        System.out.println(v.getId());
    }

    public void onOperatorButtonClick ( View v ) {
        TextView tv = findViewById(R.id.outputScreen);
        if (hasCalculated) {
            hasCalculated = false;
        }
        if ( !(tv.length() == 0) && !(tv.getText().charAt(tv.length() - 1) == '+') ) {
            Button button = findViewById(v.getId());
            String t = tv.getText().toString() + button.getText().toString() ;
            tv.setText( t );
        }
    }

    public void onCalculateButton( View view ) {
        TextView tv = findViewById(R.id.outputScreen);
        String cadena = tv.getText().toString();
        if ( tv.getText().charAt( tv.length() - 1 ) == '+' ) {
            cadena = cadena.substring( 0, cadena.length() - 1 );
        }
        int result = Calculator.calcular( cadena );
        tv.setText( String.valueOf(result) );
        hasCalculated = true;
    }


    public void onClearButton(View view) {
        TextView tv = findViewById(R.id.outputScreen);
        tv.setText("");
    }
}