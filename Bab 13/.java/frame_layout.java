import android.os.Bundle;
import androidx.appcombat.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frame_layout);
        imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.my_image);
        frameLayout.addView(imageView);
    }
}

