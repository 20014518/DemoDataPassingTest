package sg.edu.rp.c346.id20014518.demodatapassingtest;

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
        Intent i = getIntent();
        int value = i.getIntExtra("value",0);
        char cvalue = i.getCharExtra("value",'z');
        Double dvalue = i.getDoubleExtra("value",0.0);
        tvAnswer.setText("Integer value received is: " + value +
                "\nChar value is " + cvalue +
                "\nDouble value is " + dvalue);

    }
}