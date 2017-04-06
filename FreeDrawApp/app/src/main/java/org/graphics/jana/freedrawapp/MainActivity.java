package org.graphics.jana.freedrawapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageButton button_color;
    ImageButton button_pen;
    ImageButton button_new;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // paint board layout setting
        LinearLayout boardLayout = (LinearLayout)findViewById(R.id.boardLayout);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        final PaintBoard paintBoard = new PaintBoard(this);
        paintBoard.setLayoutParams(params);
        boardLayout.addView(paintBoard);

        // new button action
        button_new = (ImageButton)findViewById(R.id.button_new);
        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintBoard.clear();
            }
        });

        // color button action
        button_color = (ImageButton)findViewById(R.id.button_color);
        button_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorPaletteDialog.listener = new OnColorSelectedListener() {
                    public void onColorSelected(int color) {
                        // add paintBoard setting
                    }
                };

                Intent intent = new Intent(getApplicationContext(), ColorPaletteDialog.class);
                startActivity(intent);
            }
        });

        // pen button action
        button_pen = (ImageButton)findViewById(R.id.button_pen);
        button_pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenPaletteDialog.listener = new OnPenSelectedListener() {
                    public void onPenSelected(int pen) {
                        paintBoard.setPenType(pen);
                    }
                };

                Intent intent = new Intent(getApplicationContext(), PenPaletteDialog.class);
                startActivity(intent);
            }
        });
    }
}
