package com.dsi31g3.checkcovid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ajouterArticle<mDatabase> extends AppCompatActivity {
    EditText titr, descriptio, lie;
    Button rech ;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajouter_article);
//Hooks to all xml elements in activity_sign_up.xml
        titr = findViewById(R.id.titre);
        descriptio = findViewById(R.id.description);
        lie = findViewById(R.id.lien);
//Save data in FireBase on button click
        rech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("article");
//Get all the values
                    String titre = titr.getText().toString();
                    String description = descriptio.getText().toString();
                    String lien = lie.getText().toString();
                    UserHelperClass helperClass = new UserHelperClass(titre, description, lien);
                    reference.child(titre).setValue(helperClass);

            }
        });//Register Button method end
    }//onCreate Method End
}

