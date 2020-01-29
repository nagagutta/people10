package com.praveen.people10;

import android.content.Context;


import com.praveen.people10.adapter.FeedAdapter;
import com.praveen.people10.util.NetworkUtil;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void feedItemCount() {
        assertEquals(FeedAdapter.getAdapterItemCount(), 0);
    }

    @Test
    public void networkAvailable() {
        //assertEquals(NetworkUtil.isInternetAvailable(mContext), true);
    }

    @Test
    public void feedResponeCount() {
        assertEquals(MainActivity.getFeedResponseForTest(), 0);
    }
}