package com.jia.notetext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_normal;
    private TextView tv_rich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_normal = (TextView) findViewById(R.id.tv_normal);
        tv_rich = (TextView) findViewById(R.id.tv_rich);

        tv_normal.setOnClickListener(this);
        tv_rich.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_normal:

                startActivity(new Intent(MainActivity.this, NormalActivity.class));

                break;
            case R.id.tv_rich:

                startActivity(new Intent(MainActivity.this, RichActivity.class));

                break;
        }
    }
}
