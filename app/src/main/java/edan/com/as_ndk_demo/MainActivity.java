package edan.com.as_ndk_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import edan.com.as_ndk_demo.ndktest.NdkJniUtils;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);
        NdkJniUtils ndk_util = new NdkJniUtils();
        mTextView.setText(ndk_util.getCLanguageString());

    }
}
