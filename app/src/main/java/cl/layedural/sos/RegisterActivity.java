package cl.layedural.sos;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView txtV = findViewById(R.id.title_register);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/BlackOpsOne-Regular.ttf");
        txtV.setTypeface(face);
    }
}
