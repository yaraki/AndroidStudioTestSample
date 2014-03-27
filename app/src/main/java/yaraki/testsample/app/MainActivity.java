package yaraki.testsample.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        mText = (TextView) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                mText.setText(R.string.well_done);
                break;
            }
        }
    }

}
