package com.example.besai.wassalnimaak.sql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

import com.example.besai.wassalnimaak.R;

public class ChoixTypeUser extends AppCompatActivity {
   private Button button3;
   private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_type_user);
        //initButtons();
        //initListeners();
    }

  /**  public void initButtons (){
        button3 = (Button) findViewById(R.id.button3);
        button2 = (Button) findViewById(R.id.button2);
    }

    public void initListeners() {
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
    } **/
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                break;
            case R.id.button3:
                // Navigate to RegisterActivity
                Intent intentcompelte = new Intent(getApplicationContext(), activity_co_register.class);
                startActivity(intentcompelte);
                break;
        }
    }

}



