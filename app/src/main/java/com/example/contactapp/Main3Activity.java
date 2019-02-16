package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.contactapp.com.example.contactapp.com.example.contactapp.service.Functionality;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    private EditText email;
    private Button search;
    private Functionality functionality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        email.findViewById(R.id.editText3);
        search.findViewById(R.id.button);
    }

    public void onclick(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        String input = email.getText().toString();
        if(functionality.delete(input)) {
            intent.putExtra("delete_By_Email", "deleted successfully!");
        }else {
            intent.putExtra("delete_By_Email", "Something goes wrong!");
        }
        startActivity(intent);
    }
}
