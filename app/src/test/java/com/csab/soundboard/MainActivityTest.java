package com.csab.soundboard;

import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testActivityNotNull() {
        ActionBarActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull(activity);
    }

    @Test
    public void testGridViewNotNull() {
        ActionBarActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        GridView gridView = (GridView) activity.findViewById(R.id.gridView);
        assertNotNull(gridView);
    }
}
