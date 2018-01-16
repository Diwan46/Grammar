package com.tutorial.diwan.grammar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grammar extends AppCompatActivity {

    Button simple_present_tense, simple_past_tense, simple_future_tense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        ///Grammar
        simple_present_tense=(Button)findViewById(R.id.satu_satu);
        simple_past_tense=(Button)findViewById(R.id.satu_dua);
        simple_future_tense=(Button)findViewById(R.id.satu_tiga);
    }
    ///Grammar
    public void present (View view)
    {
        Intent intent =new Intent(Grammar.this, Simple_Present_Tense.class);
        startActivity(intent);
    }
    public void past (View view)
    {
        Intent intent =new Intent(Grammar.this, Simple_Past_Tense.class);
        startActivity(intent);
    }
    public void future (View view)
    {
        Intent intent =new Intent(Grammar.this, Simple_Future_Tense.class);
        startActivity(intent);
    }
}
