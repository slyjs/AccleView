package feng.accleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * 自定义加速度view
 *
 * @author fengdan
 *         create at 2016/1/19 16:10
 */
public class AccleView extends View {
    private Paint squPaint;
    private Paint defaultPaint;
    private int blueColor = Color.rgb(4, 123, 206);
    private int defaultColor = Color.rgb(15, 15, 16);

    private int percentCount = 0;

    public AccleView(Context context) {
        super(context);
        initView(context, null, 0);
    }

    public AccleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs, 0);
    }

    public AccleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    public void initView(Context context, AttributeSet attrs, int defStyleAttr) {

        squPaint = new Paint();
        squPaint.setAntiAlias(true);
        squPaint.setColor(blueColor);
        squPaint.setStyle(Paint.Style.FILL);//填充

        defaultPaint = new Paint();
        defaultPaint.setAntiAlias(true);
        defaultPaint.setColor(defaultColor);
        defaultPaint.setStyle(Paint.Style.FILL);//填充
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        draw(29, defaultPaint, canvas, false);
        draw(percentCount, squPaint, canvas, true);
    }

    public void setCount(int count) {
        this.percentCount = count;
        postInvalidate();
    }

    private void draw(int count, Paint paint, Canvas canvas, boolean isSet) {
//        //图形的个数
//        int countRect = 29;
        //控件的mdpi下的基本宽度和高度
        int baseWidth = 289;
        int baseHeight = 52;
        //间隔的宽度
        int intervalWidthBase = 2;
        //最小的图形的mdpi下的宽度和高度
        int baseSingleWidth = 8;
        int baseSingleHeight = 7;
        int height = 0;

        int width = getMeasuredWidth();
        height = getMeasuredHeight();
        int multiple = 1;
        multiple = width / baseWidth;
        if (multiple != 0) {
            intervalWidthBase = intervalWidthBase * multiple;
            baseSingleWidth = baseSingleWidth * multiple;
            baseSingleHeight = baseSingleHeight * multiple;
        }
        float startX = 0f;
        float endX = baseSingleWidth;
        int countY = 1;
        int countEndY = 1;

        for (int x = 1; x <= count; x++) {

            if (x == 1 || x == 2) {
                if (isSet) {
                    if (x == 1) {
                        paint.setColor(getResources().getColor(R.color.one));
                    } else if (x == 4) {
                        paint.setColor(getResources().getColor(R.color.two));
                    }
                }
                Path path = new Path();
                path.moveTo(startX, height - baseSingleHeight);
                path.lineTo(endX, height - baseSingleHeight);
                path.lineTo(endX, height);
                path.lineTo(startX, height);
                path.close();
                canvas.drawPath(path, paint);
                startX = startX + baseSingleWidth + intervalWidthBase;
                endX = endX + +baseSingleWidth + intervalWidthBase;

            } else {
                float endY = height - baseSingleHeight - countY;
                float startY = height - baseSingleHeight - countY;
                if (x >= 3 && x <= 8) {
                    if (isSet) {
                        if (x == 3) {
                            paint.setColor(getResources().getColor(R.color.three));
                        } else if (x == 4) {
                            paint.setColor(getResources().getColor(R.color.fhor));
                        } else if (x == 5) {
                            paint.setColor(getResources().getColor(R.color.fhiv));
                        } else if (x == 6) {
                            paint.setColor(getResources().getColor(R.color.six));
                        } else if (x == 7) {
                            paint.setColor(getResources().getColor(R.color.seven));
                        } else if (x == 8) {
                            paint.setColor(getResources().getColor(R.color.eight));
                        }

                    }
                    startY = startY + 1;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 1;
                } else if (x >= 9 && x <= 11) {
                    if (isSet) {
                        if (x == 9) {
                            paint.setColor(getResources().getColor(R.color.nine));
                        } else if (x == 10) {
                            paint.setColor(getResources().getColor(R.color.ten));
                        } else if (x == 11) {
                            paint.setColor(getResources().getColor(R.color.elev));
                        }
                    }
                    startY = startY + 1;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 2;
                } else if (x >= 12 && x <= 14) {
                    if (isSet) {
                        if (x == 12) {
                            paint.setColor(getResources().getColor(R.color.twlf));
                        } else if (x == 13) {
                            paint.setColor(getResources().getColor(R.color.threen));
                        } else if (x == 14) {
                            paint.setColor(getResources().getColor(R.color.forteen));
                        }
                    }
                    startY = startY + 2;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 3;
                } else if (x >= 15 && x <= 17) {
                    if (isSet) {
                        if (x == 15) {
                            paint.setColor(getResources().getColor(R.color.forteen));
                        } else if (x == 16) {
                            paint.setColor(getResources().getColor(R.color.sixteen));
                        } else if (x == 17) {
                            paint.setColor(getResources().getColor(R.color.sevteen));
                        }
                    }
                    startY = startY + 3;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 4;
                } else if (x >= 18 && x <= 19) {
                    if (isSet) {
                        if (x == 18) {
                            paint.setColor(getResources().getColor(R.color.eighteen));
                        } else if (x == 19) {
                            paint.setColor(getResources().getColor(R.color.nineteen));
                        }
                    }
                    startY = startY + 4;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 5;
                } else if (x >= 20 && x <= 21) {
                    if (isSet) {
                        if (x == 20) {
                            paint.setColor(getResources().getColor(R.color.twlteen));
                        } else if (x == 21) {
                            paint.setColor(getResources().getColor(R.color.twloneteen));
                        }
                    }
                    startY = startY + 5;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 6;
                } else if (x >= 29) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twlnineteen));
                    }
                    startY = startY + 12;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 13;
                } else if (x >= 28) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twleightteen));
                    }
                    startY = startY + 11;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 12;
                } else if (x >= 27) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twlsventeen));
                    }
                    startY = startY + 10;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 11;
                } else if (x >= 26) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twlsixteen));
                    }
                    startY = startY + 9;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 10;
                } else if (x >= 25) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twlfiveteen));
                    }
                    startY = startY + 8;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 9;
                } else if (x >= 23 && x <= 24) {
                    if (isSet) {
                        if (x == 23) {
                            paint.setColor(getResources().getColor(R.color.twlthreeteen));
                        } else if (x == 24) {
                            paint.setColor(getResources().getColor(R.color.twlforteen));
                        }
                    }
                    startY = startY + 7;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 8;
                } else if (x >= 22) {
                    if (isSet) {
                        paint.setColor(getResources().getColor(R.color.twltwoteen));
                    }
                    startY = startY + 6;
                    drawPathCommon(startX, startY, endX, endY, paint, canvas);
                    countY = countY + 7;
                }
                startX = startX + baseSingleWidth + intervalWidthBase;
                endX = endX + +baseSingleWidth + intervalWidthBase;
            }
        }
    }

    public void drawPathCommon(float startX, float startY, float endX, float endY, Paint paint, Canvas canvas) {
        Path path = new Path();
        path.moveTo(startX, startY);
        path.lineTo(endX, endY);
        path.lineTo(endX, getMeasuredHeight());
        path.lineTo(startX, getMeasuredHeight());
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
