package org.graphics.jana.freedrawapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout boardLayout = (LinearLayout)findViewById(R.id.boardLayout);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        PaintBoard paintBoard = new PaintBoard(this);
        paintBoard.setLayoutParams(params);
        boardLayout.addView(paintBoard);
    }
}
