package fr.wildcodeschool.applisimple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSend = findViewById(R.id.button);

        CheckBox yes = findViewById(R.id.checkBox_yes);
        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Button buttonSend = findViewById(R.id.button);
                EditText firstname = findViewById(R.id.editText_first);
                EditText lastname = findViewById(R.id.editText_last);
                if (isChecked){

                    firstname.setEnabled(true);
                    lastname.setEnabled(true);
                    buttonSend.setEnabled(true);


                }
                    else{
                    firstname.setEnabled(false);
                    lastname.setEnabled(false);
                    buttonSend.setEnabled(false);
                    }
                }

        });



        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstname = findViewById(R.id.editText_first);
                EditText lastname = findViewById(R.id.editText_last);

                 TextView congrat = findViewById(R.id.textView_congratulation);
                 String prenom = firstname.getText().toString();
                 String nom = lastname.getText().toString();

                    if (prenom.equals("") || nom.equals("")){


                        Toast.makeText(MainActivity.this, "Please fill your firstname and lastname", Toast.LENGTH_SHORT).show();

                    }
                        else {
                        congrat.setText("Congratulation " + prenom + " " + nom);

                        }
            }


        });
    }
}