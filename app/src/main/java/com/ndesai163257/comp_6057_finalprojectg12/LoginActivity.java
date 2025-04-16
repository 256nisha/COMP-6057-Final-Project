package com.ndesai163257.comp_6057_finalprojectg12;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create ConstraintLayout
        ConstraintLayout layout = new ConstraintLayout(this);
        layout.setId(View.generateViewId());
        layout.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        layout.setPadding(24, 24, 24, 24);

        // Create EditText for Email
        EditText editTextEmail = new EditText(this);
        editTextEmail.setId(View.generateViewId());
        editTextEmail.setHint("Email");
        editTextEmail.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        editTextEmail.setMinHeight(48);
        layout.addView(editTextEmail);

        // Create EditText for Password
        EditText editTextPassword = new EditText(this);
        editTextPassword.setId(View.generateViewId());
        editTextPassword.setHint("Password");
        editTextPassword.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
        editTextPassword.setMinHeight(48);
        layout.addView(editTextPassword);

        // Create Login Button
        Button buttonLogin = new Button(this);
        buttonLogin.setId(View.generateViewId());
        buttonLogin.setText("Login");
        layout.addView(buttonLogin);

        // Set constraints using ConstraintSet
        ConstraintSet set = new ConstraintSet();
        set.clone(layout);

        // Email Constraints
        set.connect(editTextEmail.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        set.connect(editTextEmail.getId(), ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END);
        set.connect(editTextEmail.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 148);
        set.constrainWidth(editTextEmail.getId(), ConstraintSet.MATCH_CONSTRAINT);

        // Password Constraints
        set.connect(editTextPassword.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        set.connect(editTextPassword.getId(), ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END);
        set.connect(editTextPassword.getId(), ConstraintSet.TOP, editTextEmail.getId(), ConstraintSet.BOTTOM, 24);
        set.constrainWidth(editTextPassword.getId(), ConstraintSet.MATCH_CONSTRAINT);

        // Button Constraints
        set.connect(buttonLogin.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        set.connect(buttonLogin.getId(), ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END);
        set.connect(buttonLogin.getId(), ConstraintSet.TOP, editTextPassword.getId(), ConstraintSet.BOTTOM, 12);

        set.applyTo(layout);

        setContentView(R.layout.activity_login);
    }
}
