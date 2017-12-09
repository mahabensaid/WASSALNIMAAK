package com.example.besai.wassalnimaak.sql;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;

import com.example.besai.wassalnimaak.R;
import com.example.besai.wassalnimaak.helpers.InputValidation;

public class activity_co_register extends AppCompatActivity {

    private Button button2;
    private Button button;
    private TextInputLayout textInputcartype;
    private TextInputLayout textInputLayotdescrib;
    private TextInputEditText type_voiture;
    private TextInputEditText EditTextdescription;
    private InputValidation inputValidation;
    private final AppCompatActivity activity = activity_co_register.this;
    private NestedScrollView nestedScrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_register);
        getSupportActionBar().hide();

        initViews();
        initObjects();
    }
    private void initViews() {

       textInputcartype = (TextInputLayout) findViewById(R.id.textInputcartype);
        textInputLayotdescrib = (TextInputLayout) findViewById(R.id.textInputLayotdescrib);
       type_voiture = (TextInputEditText) findViewById(R.id.type_voiture);
        EditTextdescription = (TextInputEditText) findViewById(R.id.EditTextdescription);

        button = (AppCompatButton) findViewById(R.id.button);

        button2 = (AppCompatButton) findViewById(R.id.button2);
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);



    }
    private void initObjects() {
        inputValidation = new InputValidation(activity);}


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intentcontent1 = new Intent(getApplicationContext(), Menu_conducteur.class);
                startActivity(intentcontent1);

                break;
            case R.id.button:
                // Navigate to accueil conducteur
                verifyinputs();
                emptyInputEditText();
                break;

        }
    }

    private void verifyinputs() {
        if (!inputValidation.isInputEditTextFilled(type_voiture, textInputcartype, getString(R.string.error_message_cartype))) {
            return;        }


        else { Intent intentcontent2 = new Intent(getApplicationContext(), Menu_conducteur.class);
            startActivity(intentcontent2);
            }


    }


    private void emptyInputEditText() {
        EditTextdescription.setText(null);
        type_voiture.setText(null);}
}


