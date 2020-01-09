package id.poliban.ac.mi.latihan08;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;

public class Calculate extends AppCompatActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        int fno = getIntent().getIntExtra("fno",1);
        int sno = getIntent().getIntExtra("sno",1);
        int big, small;
        int remain = 1;

        if (fno>sno){
            big = fno;
            small = sno;
        }
        else {
            big = sno;
            small = fno;
        }

        while ((remain=big %small) !=0){
            big = small;
            small = remain;
        }
        TextView tvResult = findViewById(R.id.tvResult);
        tvResult.setText(String.format("GCF = %3d", small));


    }
}
