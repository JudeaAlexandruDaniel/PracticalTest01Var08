package ro.pub.cs.systems.eim.practicaltest01var08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var08Service extends AppCompatActivity {

   private EditText leftEditText;
   private EditText rightEditText;
   private Button SecButton, ThrButton;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.thr_button:
                    break;
            }
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_service);


//        String text = getIntent().getStringExtra("Riddle");
//        leftEditText.setText (text);


        leftEditText = (EditText)findViewById(R.id.sec_left_edit_text);
        rightEditText = (EditText)findViewById(R.id.sec_right_edit_text);

        SecButton = (Button)findViewById(R.id.sec_button);
        ThrButton = (Button)findViewById(R.id.thr_button);
        ThrButton.setOnClickListener(buttonClickListener);

        leftEditText.setText(String.valueOf("Riddle"));
        rightEditText.setText(String.valueOf("Edit"));

        String text = getIntent().getStringExtra("Riddle");
        leftEditText.setText (text);
    }
}