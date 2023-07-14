import android.os.Bundle;
import androidx.appcombat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relative_layout);
        textView = new TextView(this);
        textView.setText("Hello, RelativeLayout!");
        button = new Button(this);
        button.setText("Click Me");

        RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        textParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textParams.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonParams.addRule(RelativeLayout.BELOW, textView.getId());
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        textView.setLayoutParams(textParams);
        button.setLayoutParams(buttonParams);

        relativeLayout.addView(textView);
        relativeLayout.addView(button);
    }
}

