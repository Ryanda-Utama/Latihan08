package id.poliban.ac.mi.latihan08;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstnumber;
    private EditText etSecondnumber;


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Close Comfirmation")
                .setTitle("Close app?")
                .setIcon(android.R.drawable.star_big_on)
                .setCancelable(true)
                .setPositiveButton("Yes", ((dialog, which) -> super.onBackPressed()))
                .setNegativeButton("No", null);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstnumber = findViewById(R.id.etFirstnumber);
        etSecondnumber = findViewById(R.id.etSecondnumber);
        Button btCalculate = findViewById(R.id.btCalculate);

        btCalculate.setOnClickListener(v ->{
            int fno = Integer.parseInt(etFirstnumber.getText().toString());
            int sno = Integer.parseInt(etSecondnumber.getText().toString());
            Intent intent = new Intent(this, Calculate.class);
            intent.putExtra("fno", fno);
            intent.putExtra("sno", sno);
            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        etFirstnumber.setText("");
        etSecondnumber.setText("");
        etFirstnumber.requestFocus();
    }
}
