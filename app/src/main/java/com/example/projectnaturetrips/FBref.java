package com.example.projectnaturetrips;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FBref {

    public static FirebaseDatabase FBDB= FirebaseDatabase.getInstance() ;

    public static DatabaseReference refUser=FBDB.getReference("Users") ;
    //public static DatabaseReference refPassworrd=FBDB.getReference("Password") ;
}
