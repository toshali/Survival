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

/**
 * Created by toshali on 4/13/15.
 */
public class Bullets extends View {
    Bitmap bball;
    int x, y;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect ourRect = new Rect();
        ourRect.set(0,0,canvas.getWidth(),canvas.getHeight()/2);
        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, blue);
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

    public Bullets(Context context){
        super(context);
        bball = BitmapFactory.decodeResource(getResources(),R.drawable.missile);
        int x = 0;
        int y = 0;

    }



}
