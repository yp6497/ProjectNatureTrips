package com.example.projectnaturetrips;

import static com.example.projectnaturetrips.FBref.refUser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText Uemail, Upassword;
    User user ;
    String emailS,passwordS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uemail= findViewById(R.id.Uemail);
        Upassword = findViewById(R.id.Upassword);

        //user = new Users (Uemail, Upassword );
        //refUsers.user(UsId).setValue(user);

    }

    public void SignIn(View view) {

        emailS = Uemail.toString();
        passwordS = Upassword.toString();
        //user = new User (emailS, passwordS);
        //refUser.setValue(user);

        //if(Uemail.getText().toString().equals("admin") && Upassword.getText().toString().equals("admin")){

        }



    //@Override
    public boolean onCreatOptionMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

       return true;
    }

    @Override
      public boolean onOptionsItemSelected(MenuItem item){

        String st= item.getTitle().toString();
        if(st=="Map") Toast.makeText(this, st, Toast.LENGTH_SHORT).show();

        return true;
    }
  }
