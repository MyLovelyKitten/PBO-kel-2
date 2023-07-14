import android.os.Bundle;
import androidx.appcombat.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linear_layout);

        // Membuat TextView secara dinamis
        for (int i = 0; i < 20; i++) {
            TextView textView = new TextView(this);
            textView.setText("Item " + (i + 1));
            linearLayout.addView(textView);
        }
    }
}

