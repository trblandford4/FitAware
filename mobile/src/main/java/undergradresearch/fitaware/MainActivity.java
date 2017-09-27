package undergradresearch.fitaware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mToggleWatchFaceBgColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToggleWatchFaceBgColor = (Button) findViewById(R.id.toggle_background_color_btn);

        mToggleWatchFaceBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Watchface bg should change",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
