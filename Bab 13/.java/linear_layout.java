import android.os.Bundle;
import androidx.appcombat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linear_layout);
        textView = new TextView(this);
        textView.setText("Hello, LinearLayout!");
        button = new Button(this);
        button.setText("Click Me");

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(16, 16, 16, 16);
        textView.setLayoutParams(layoutParams);
        button.setLayoutParams(layoutParams);

        linearLayout.addView(textView);
        linearLayout.addView(button);
    }
}

