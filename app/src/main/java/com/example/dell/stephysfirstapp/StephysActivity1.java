package com.example.dell.stephysfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StephysActivity1 extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stephys1);
    }

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Toast msg",Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        TextView countValueTextView = (TextView) findViewById(R.id.textView);
        String currentCount = countValueTextView.getText().toString();
        Integer countToBe = Integer.parseInt(currentCount);
        countToBe++;
        countValueTextView.setText(countToBe.toString());
    }

    public void randomMe(View view){

        TextView countValueTextView = (TextView) findViewById(R.id.textView);
        String currentCount = countValueTextView.getText().toString();
        int count = Integer.parseInt(currentCount);

        Intent randomIntent = new Intent(this, SecondActivity.class);
        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);


    }

}
