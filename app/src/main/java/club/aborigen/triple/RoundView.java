package club.aborigen.triple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class RoundView extends View {
    private final Paint paint;
    public RoundView(Context context) {
        this(context, null, 0, 0);
    }
    public RoundView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0, 0);
    }
    public RoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public RoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(getWidth()/2.0f, getHeight()/2.0f, getWidth()/4.0f, paint);
    }

    public void setColor(int color) {
        paint.setColor(color);
    }
}
