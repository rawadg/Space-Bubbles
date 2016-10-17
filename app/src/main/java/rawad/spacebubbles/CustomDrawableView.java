package rawad.spacebubbles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class CustomDrawableView extends View {
    private ShapeDrawable mDrawable;

    public CustomDrawableView(Context context, int a, int b) {
        super(context);

        int x = a;
        int y = b;
        int width = 50;
        int height = 50;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff74AC23);
        mDrawable.setBounds(x, y, x + width, y + height);

        invalidate();

    }

    protected void onDraw(Canvas canvas) {
        mDrawable.draw(canvas);
        invalidate();
    }
}
