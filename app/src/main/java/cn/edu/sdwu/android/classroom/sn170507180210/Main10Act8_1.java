package cn.edu.sdwu.android.classroom.sn170507180210;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Main10Act8_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //使用编码方式实现布局
        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));

        ImageView imageView=new ImageView(this);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setImageResource(R.drawable.bizhi1);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(imageView);

        TextView textView=new TextView(this);
        textView.setText("Jeonghan");
        textView.setTextColor(Color.RED);
        textView.setTextSize(50);
        textView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        frameLayout.addView(textView);

        setContentView(frameLayout);

    }
}