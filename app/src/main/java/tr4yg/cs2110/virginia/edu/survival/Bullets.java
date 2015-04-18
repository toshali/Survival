package tr4yg.cs2110.virginia.edu.survival;

import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Color;

import org.w3c.dom.Attr;

import java.text.AttributedCharacterIterator;

/**
 * Created by toshali on 4/13/15.
 */
public class Bullets extends View {
    Bitmap bball;
    int x, y;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        if (x < canvas.getWidth()) {
            x += 10;
        }
        if (y < canvas.getHeight()) {
            y += 10;
        }
        else {
            y = 0;
        }
        Paint p = new Paint();
        canvas.drawBitmap(bball, x, y, p);
        invalidate();
    }

    public void init(Context context){
        bball = BitmapFactory.decodeResource(getResources(),R.drawable.missile);
        int x = 0;
        int y = 0;
    }

    public Bullets(Context context) {
        super(context);
        init(context);
    }
    public Bullets(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    public Bullets(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public void View(Context context, AttributeSet attrs){}

    public void View(Context context, AttributeSet attrs, int defStyle){}



}
