package com.example.solutionfortask252;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.KeyEvent.KEYCODE_ENTER;

public class MainActivity extends AppCompatActivity {

    final String login = "login";
    final String password = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sign(View view)
    {
        TextView valid = (TextView) findViewById(R.id.validInfo);

        EditText et_login = (EditText) findViewById(R.id.login);
        EditText et_pass = (EditText) findViewById(R.id.password);

        String sign_login = et_login.getText().toString();
        String sign_pass = et_pass.getText().toString();

        if(sign_login.equals(login) && sign_pass.equals(password))
        {
            valid.setTextColor(getResources().getColor(R.color.green));
            valid.setText("Верно");
        }
        else
        {
            valid.setTextColor(getResources().getColor(R.color.red));
            valid.setText("Вы ошиблись в логине или пароле");

            ((EditText) findViewById(R.id.login)).setText("");
            ((EditText) findViewById(R.id.password)).setText("");
        }
    }

    public boolean EnterKey(View view, int keyCode)
    {
        boolean pressed = false;
        if(keyCode == KEYCODE_ENTER)
        {
            Sign(view);
            pressed = true;
        }
        return pressed;
    }
}