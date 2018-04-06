package cl.layedural.sos;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        TextView txtV = findViewById(R.id.title);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/BlackOpsOne-Regular.ttf");
        txtV.setTypeface(face);


         Button registerBtn = findViewById(R.id.registerBtn);
         registerBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent_register = new Intent(SignActivity.this, RegisterActivity.class);
                 startActivity(intent_register);
             }
         });


    }


}
