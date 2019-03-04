package net.vrgsoft.smscodeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import net.vrgsoft.smsview.SmsCodeView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SmsCodeView smsCodeView = findViewById(R.id.smsCodeView);

        findViewById(R.id.btn_set_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smsCodeView.setText("458492");
            }
        });

        findViewById(R.id.btn_clear_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smsCodeView.clear();
            }
        });

    }

    public void onSubmit(String text) {
        Log.i(LOG_TAG, text);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
