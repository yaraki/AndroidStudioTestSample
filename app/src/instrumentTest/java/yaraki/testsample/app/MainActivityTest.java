package yaraki.testsample.app;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @UiThreadTest
    public void testButtonClick() throws Exception {
        MainActivity activity = getActivity();
        TextView textView = (TextView) activity.findViewById(R.id.text);
        CharSequence textBefore = textView.getText();
        assertNotNull(textBefore);
        assertEquals(activity.getString(R.string.hello), textBefore.toString());
        Button button = (Button) activity.findViewById(R.id.button);
        button.performClick();
        CharSequence textAfter = textView.getText();
        assertNotNull(textAfter);
        assertEquals(activity.getString(R.string.well_done), textAfter.toString());
    }

}
