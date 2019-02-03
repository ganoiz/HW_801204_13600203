package th.ac.su.ict.wanida.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvColor;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = findViewById(R.id.tvColor);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix= findViewById(R.id.btnSix);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("225-235-221");
                tvColor.setBackgroundColor(Color.rgb(235, 225, 221 ));
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("236-203-202");
                tvColor.setBackgroundColor(Color.rgb(236, 203, 202 ));

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("117-131-156");
                tvColor.setBackgroundColor(Color.rgb(117, 131, 156 ));

            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("153-169-191");
                tvColor.setBackgroundColor(Color.rgb(153, 169, 191 ));

            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("195-204-213");
                tvColor.setBackgroundColor(Color.rgb(195, 204, 213 ));

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvColor.setText("221-226-229");
                tvColor.setBackgroundColor(Color.rgb(221, 226, 229 ));

            }
        });

    }
}
