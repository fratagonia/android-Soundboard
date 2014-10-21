package com.csab.soundboard;

import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18)
public class MainActivityTest {

    @Test
    public void gridViewIsNotNull() {
        ActionBarActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        GridView gridView = (GridView) activity.findViewById(R.id.gridView);
        assertNotNull(gridView);
    }
}
