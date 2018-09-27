package cn.zdh.statelistanimator;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }


    public void click(View view) {
        StateListAnimator animator = AnimatorInflater.loadStateListAnimator(this, R.animator.bt_animator);
        tv.setStateListAnimator(animator);

    }
}
