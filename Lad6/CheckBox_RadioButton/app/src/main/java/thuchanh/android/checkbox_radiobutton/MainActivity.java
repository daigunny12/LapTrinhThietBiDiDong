package thuchanh.android.checkbox_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCheckBox;
    private Button btnRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheckBox = (Button)findViewById(R.id.btnCheckBox);
        btnRadioButton = (Button)findViewById(R.id.btnRadioButton);

        btnCheckBox.setOnClickListener(this);
        btnRadioButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCheckBox){
            Intent intent = new Intent(MainActivity.this, Vidu_CheckBoxActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btnRadioButton ){
            Intent intent = new Intent(MainActivity.this , Vidu_RadioButtonActivity.class);
            startActivity(intent);
        }
    }
}
