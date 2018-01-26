package org.bubulescu.warningdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnWarning, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWarning = findViewById(R.id.btnWarning);
        btnExit = findViewById(R.id.btnExit);

        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WarningDialog warningDialog = new WarningDialog();
                warningDialog.show(getSupportFragmentManager(), "wd");

            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExitDialog exitDialog = new ExitDialog();
                exitDialog.show(getSupportFragmentManager(), "ed");
            }
        });
    }
}
