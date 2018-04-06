package cl.layedural.sos;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView txtV = findViewById(R.id.welcomeText);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/BlackOpsOne-Regular.ttf");
        txtV.setTypeface(face);

        Button startButton = findViewById(R.id.start);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_start = new Intent(WelcomeActivity.this, SignActivity.class);
                startActivity(intent_start);
            }
        });
    }


}
