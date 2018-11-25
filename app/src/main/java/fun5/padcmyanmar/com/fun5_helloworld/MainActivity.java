package fun5.padcmyanmar.com.fun5_helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Fun5_HelloWorld", "User tag login");
                EditText etUserPhone = findViewById(R.id.et_user_phone);
                String userPhone = etUserPhone.getText().toString();
                if (TextUtils.isEmpty(userPhone)) {
                    etUserPhone.setError("Enter your phone here");
                    return;
                }

                EditText etUserPassword = findViewById(R.id.et_user_password);
                String  userPassword = etUserPassword.getText().toString();
                if (TextUtils.isEmpty(userPassword)) {
                    etUserPassword.setError("Enter your password");
                }

                if (TextUtils.equals(userPhone, "09798404437") && (TextUtils.equals(userPassword, "abc"))) {
                    Snackbar.make(v, "Login Success", Snackbar.LENGTH_INDEFINITE).show();
                }else {
                    Toast.makeText(v.getContext(),"Phone Number and Password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
