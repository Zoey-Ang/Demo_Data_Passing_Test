package sg.edu.rp.c346.id20046523.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInt;
    Button btnPassChar;
    TextView tvPassDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt = findViewById(R.id.buttonPassInteger);
        btnPassInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, SecondActivity.class);
                a.putExtra("value",1);
                startActivity(a);
            }
        });

        btnPassChar = findViewById(R.id.buttonPassChar);
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, SecondActivity.class);
                c.putExtra("value",'b'); //char only can have one letter
                startActivity(c);
            }
        });

        tvPassDouble = findViewById(R.id.textViewPassDouble);
        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this, SecondActivity.class);
                d.putExtra("value",99.99); //no need quotations as it is a double
                startActivity(d);
            }
        });
    }
}