package unifor.br.trabalhodedispositivosmoveis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LogIn = (Button) findViewById(R.id.LogIn_Button);

        LogIn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override

                    public void onClick(View v){
                        Intent i = new Intent(v.getContext(),CalendarMainActivity.class);
                    }
                }
        );
    }

}
