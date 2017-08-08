package com.example.sarbo.criminalintent.controller;

import android.support.v4.app.Fragment;

import com.example.sarbo.criminalintent.SingleFragmentActivity;

/**
 * Created by sarbo on 7/27/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
