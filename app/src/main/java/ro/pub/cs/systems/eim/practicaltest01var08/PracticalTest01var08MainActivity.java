package ro.pub.cs.systems.eim.practicaltest01var08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import android.os.Bundle;

public class PracticalTest01var08MainActivity extends AppCompatActivity {

    private EditText leftEditText;
    private EditText rightEditText;

    private Button pressMeButton;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.first_button:
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var08Service.class);
                    intent.putExtra("Riddle", leftEditText.getText());
                    startActivityForResult(intent, 1);
                    break;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical__test01_var08_main);

        leftEditText = (EditText)findViewById(R.id.left_edit_text);
        rightEditText = (EditText)findViewById(R.id.right_edit_text);

        pressMeButton = (Button)findViewById(R.id.first_button);
        pressMeButton.setOnClickListener(buttonClickListener);

        leftEditText.setText(String.valueOf("Riddle"));
        rightEditText.setText(String.valueOf("Answer"));

        pressMeButton = (Button)findViewById(R.id.first_button);

    }
}