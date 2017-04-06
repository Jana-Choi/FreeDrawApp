package org.graphics.jana.freedrawapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

/**
 * Created by ejchoi on 2017-04-06.
 */

public class PenPaletteDialog extends Activity {
    GridView grid;
    Button closeBtn;
    PenDataAdapter adapter;

    public static OnPenSelectedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);

        this.setTitle("Pen");

        grid = (GridView) findViewById(R.id.colorGrid);
        closeBtn = (Button) findViewById(R.id.closeBtn);

        grid.setColumnWidth(14);
        grid.setBackgroundColor(Color.GRAY);
        grid.setVerticalSpacing(4);
        grid.setHorizontalSpacing(4);

        adapter = new PenDataAdapter(this);
        grid.setAdapter(adapter);
        grid.setNumColumns(adapter.getNumColumns());

        closeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // dispose this activity
                finish();
            }
        });
    }
}


class PenDataAdapter extends BaseAdapter {
    /**
     * Application Context
     */
    Context mContext;

    /**
     * Pens defined
     */
    public static final int [] pens = new int[] {
            0, 1, 2, 3,
            4, 5, 6, 7
    };

    int rowCount;
    int columnCount;



    public PenDataAdapter(Context context) {
        super();

        mContext = context;

        rowCount = 2;
        columnCount = 4;
    }

    public int getNumColumns() {
        return columnCount;
    }

    public int getCount() {
        return rowCount * columnCount;
    }

    public Object getItem(int position) {
        return pens[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup group) {
        Log.d("PenDataAdapter", "getView(" + position + ") called.");

        // calculate position
        int rowIndex = position / rowCount;
        int columnIndex = position % rowCount;
        Log.d("PenDataAdapter", "Index : " + rowIndex + ", " + columnIndex);

        GridView.LayoutParams params = new GridView.LayoutParams(
                GridView.LayoutParams.MATCH_PARENT,
                GridView.LayoutParams.MATCH_PARENT);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_pen, options);
        switch (position) {
            case 1: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_basic, options); break;
            case 2: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_charcoal, options); break;
            case 3: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_short_grass, options); break;
            case 4: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_watercolor_expressive, options); break;
            case 5: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_leaves, options); break;
            case 6: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_calligraphy, options); break;
            case 7: penBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pen_glow, options); break;
            default: assert (position >= 0 && position <= 7); break;
        }

        BitmapDrawable penDrawable = new BitmapDrawable(mContext.getResources(), penBitmap);

        // create a Button with the color
        Button aItem = new Button(mContext);
        aItem.setText(" ");
        aItem.setLayoutParams(params);
        aItem.setPadding(4, 4, 4, 4);
        aItem.setBackgroundDrawable(penDrawable);
        aItem.setHeight(120);
        aItem.setTag(pens[position]);

        // set listener
        aItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (PenPaletteDialog.listener != null) {
                    PenPaletteDialog.listener.onPenSelected(((Integer)v.getTag()).intValue());
                }

                ((PenPaletteDialog)mContext).finish();
            }
        });

        return aItem;
    }
}
