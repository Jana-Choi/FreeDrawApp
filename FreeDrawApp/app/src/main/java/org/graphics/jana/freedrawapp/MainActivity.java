package org.graphics.jana.freedrawapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageButton button_new;
    ImageButton button_pen;
    ImageButton button_color;
    ImageButton button_size;
    ImageButton button_eraser;
    ImageButton button_save;

    int m_nPen = 0;
    int m_nColor = 0xff000000;
    int m_nSize = 2;

    boolean m_bEraserSelected = false;

    boolean m_bPropertyEnable = true;
    int m_nPropertAlpha = 255;


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
        paintBoard.setPen(m_nPen);
        paintBoard.setColor(m_nColor);
        paintBoard.setSize(m_nSize);

        paintBoard.setLayoutParams(params);
        boardLayout.addView(paintBoard);

        button_new = (ImageButton)findViewById(R.id.button_new);
        button_pen = (ImageButton)findViewById(R.id.button_pen);
        button_color = (ImageButton)findViewById(R.id.button_color);
        button_size = (ImageButton)findViewById(R.id.button_size);
        button_eraser = (ImageButton)findViewById(R.id.button_eraser);
        button_save = (ImageButton)findViewById(R.id.button_save);

        // new button action
        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintBoard.clear();
            }
        });

        // pen button action
        button_pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenPaletteDialog.listener = new OnPenSelectedListener() {
                    public void onPenSelected(int pen) {
                        m_nPen = pen;
                        paintBoard.setPen(m_nPen);

                        if(m_nPen == 0) {
                            m_bPropertyEnable = true;
                            m_nPropertAlpha = 255;
                        }
                        else {
                            m_bPropertyEnable = false;
                            m_nPropertAlpha = 50;
                        }

                        button_color.setEnabled(m_bPropertyEnable);
                        button_size.setEnabled(m_bPropertyEnable);

                        button_color.setAlpha(m_nPropertAlpha);
                        button_size.setAlpha(m_nPropertAlpha);

                        button_color.invalidate();
                        button_size.invalidate();
                    }
                };

                Intent intent = new Intent(getApplicationContext(), PenPaletteDialog.class);
                startActivity(intent);
            }
        });

        // color button action
        button_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorPaletteDialog.listener = new OnColorSelectedListener() {
                    public void onColorSelected(int color) {
                        m_nColor = color;
                        paintBoard.setColor(m_nColor);
                    }
                };

                Intent intent = new Intent(getApplicationContext(), ColorPaletteDialog.class);
                startActivity(intent);
            }
        });

        // size button action
        button_size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SizePaletteDialog.listener = new OnSizeSelectedListener() {
                    @Override
                    public void onSizeSelected(int size) {
                        m_nSize = size;
                        paintBoard.setSize(m_nSize);
                    }
                };

                Intent intent = new Intent(getApplicationContext(), SizePaletteDialog.class);
                startActivity(intent);
            }
        });

        // eraser button action
        button_eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_bEraserSelected = !m_bEraserSelected;

                if(m_bEraserSelected) {
                    button_pen.setEnabled(false);
                    button_color.setEnabled(false);
                    button_size.setEnabled(false);

                    button_pen.setAlpha(50);
                    button_color.setAlpha(50);
                    button_size.setAlpha(50);

                    button_pen.invalidate();
                    button_color.invalidate();
                    button_size.invalidate();

                    paintBoard.setPen(0);
                    paintBoard.setColor(getResources().getColor(R.color.colorBaseBackground));
                    paintBoard.setSize(16);
                }
                else {
                    button_pen.setEnabled(true);
                    button_color.setEnabled(m_bPropertyEnable);
                    button_size.setEnabled(m_bPropertyEnable);

                    button_pen.setAlpha(255);
                    button_color.setAlpha(m_nPropertAlpha);
                    button_size.setAlpha(m_nPropertAlpha);

                    button_pen.invalidate();
                    button_color.invalidate();
                    button_size.invalidate();

                    paintBoard.setPen(m_nPen);
                    paintBoard.setColor(m_nColor);
                    paintBoard.setSize(m_nSize);
                }
            }
        });

        // save button action
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintBoard.save();
            }
        });
    }
}
