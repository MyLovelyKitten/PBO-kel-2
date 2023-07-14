import android.os.Bundle;
import androidx.appcombat.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.table_layout);

        // Membuat judul kolom
        TableRow headerRow = new TableRow(this);
        headerRow.setGravity(Gravity.CENTER_HORIZONTAL);
        headerRow.setPadding(16, 16, 16, 16);

        TextView header1 = new TextView(this);
        header1.setText("Header 1");
        header1.setGravity(Gravity.CENTER);
        headerRow.addView(header1);

        TextView header2 = new TextView(this);
        header2.setText("Header 2");
        header2.setGravity(Gravity.CENTER);
        headerRow.addView(header2);

        tableLayout.addView(headerRow);

        // Membuat data baris
        for (int i = 0; i < 5; i++) {
            TableRow row = new TableRow(this);
            row.setGravity(Gravity.CENTER_HORIZONTAL);
            row.setPadding(16, 16, 16, 16);

            TextView data1 = new TextView(this);
            data1.setText("Data " + (i + 1) + " - Kolom 1");
            data1.setGravity(Gravity.CENTER);
            row.addView(data1);

            TextView data2 = new TextView(this);
            data2.setText("Data " + (i + 1) + " - Kolom 2");
            data2.setGravity(Gravity.CENTER);
            row.addView(data2);

            tableLayout.addView(row);
        }
    }
}

