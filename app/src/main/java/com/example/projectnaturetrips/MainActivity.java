package com.example.projectnaturetrips;

import static com.example.projectnaturetrips.FBref.refUser;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    EditText Uemail, Upassword;
    User user ;
    String emailS,passwordS;
    FirebaseAuth mFireBaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFireBaseAuth = FirebaseAuth.getInstance();
        Uemail= findViewById(R.id.Uemail);
        Upassword = findViewById(R.id.Upassword);

        //user = new Users (Uemail, Upassword );
        //refUsers.user(UsId).setValue(user);

    }

    public void SignIn(View view) {

        emailS = Uemail.getText().toString();
        passwordS = Upassword.getText().toString();

        if(emailS.isEmpty()){

            Toast.makeText(this, "email", Toast.LENGTH_LONG).show();
            //Uemail.setError("enter an email");
            //Uemail.requestFocus();
        }
        if(passwordS.isEmpty()){

            Toast.makeText(this, "password", Toast.LENGTH_LONG).show();
            //Upassword.setError("enter a password");
            //Upassword.requestFocus();
        }
        //user = new User (emailS, passwordS);
        //refUser.setValue(user);

        //if(Uemail.getText().toString().equals("admin") && Upassword.getText().toString().equals("admin")){

        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

       return true;
    }

    @Override
      public boolean onOptionsItemSelected(MenuItem item){

        String st= item.getTitle().toString();
        if(st.endsWith("Map")) Toast.makeText(this, "lol", Toast.LENGTH_LONG).show();

        return true;
    }
  }
