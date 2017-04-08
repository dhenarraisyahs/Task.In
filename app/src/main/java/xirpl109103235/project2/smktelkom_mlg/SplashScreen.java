package xirpl109103235.project2.smktelkom_mlg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            sleep(3000);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
