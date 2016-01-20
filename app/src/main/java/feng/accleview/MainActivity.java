package feng.accleview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends Activity {
    AccleView speedBiaoPanView;
    SeekBar mSebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_biao_pan);
        speedBiaoPanView = (AccleView) findViewById(R.id.accleview);
        speedBiaoPanView.setCount(18);
        mSebar = (SeekBar) findViewById(R.id.seekbar);
        mSebar.setMax(100);
        mSebar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float count = (float) progress / 100 * 29;
                speedBiaoPanView.setCount((int) count);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
