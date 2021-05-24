package sg.edu.rp.c346.id20046523.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent recIntent =getIntent();
        int value=recIntent.getIntExtra("value", 0);
        char charValue = recIntent.getCharExtra("value",'z');
        double doubleValue = recIntent.getDoubleExtra("value",0.0);
        tvAnswer.setText("Integer value received is: " +value + "\nChar value is " + charValue + "\nDouble value is " +doubleValue);
        //tvAnswer.setText("Char value is " + charValue);
        //tvAnswer.setText("Double value is " + doubleValue);
    }
}