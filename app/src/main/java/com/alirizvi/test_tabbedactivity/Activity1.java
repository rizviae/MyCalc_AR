package com.alirizvi.test_tabbedactivity;

import java.util.Locale;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class activity_activity1 extends Activity {
    int buttonlist[] = {R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5, R.id.num6, R.id.num7, R.id.num8,
            R.id.num9, R.id.numzero, R.id.numDec, R.id.clear, R.id.advanced, R.id.divide, R.id.minus, R.id.multiply,
            R.id.numPlus, R.id.numCalc};

    private EditText calcbar;
    private String Scr;
    private float NumBefore;
    private String Operation;
    private ButtonClickListener myButtonClick;

    public void mResult() {
        float numAf = Float.parseFloat(Scr.getText().toString());
        float result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        Scr = (EditText) findViewById(R.id.calcbar);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        num0 = (Button) findViewById(R.id.numzero);
        numdec = (Button) findViewById(R.id.numDec);

        clearIt = (Button) findViewById(R.id.clear);
        goAdvanced = (Button) findViewById(R.id.advanced);
        calcdiv = (Button) findViewById(R.id.divide);
        calcminus = (Button) findViewById(R.id.minus);
        calcplus = (Button) findViewById(R.id.numPlus);
        calcmultiply = (Button) findViewById(R.id.minus);
        doit = (Button) findViewById(R.id.numCalc);

//results button
        results = (EditText) findViewById(R.id.calcbar);


    public void mycalcoperator(String str) {
        NumBefore = float.parseFloat(Scr.getText().toString()));
        Operation = str;
        Scr.setText(“0”);

    public void getKeyboard(String str) {
        String StrCurrent = Scr.getText().toString();
        if (ScrCurrent.equals(“0”))
            Scr.Current =“”;
        SetCurrent += str;
        Scr.setText(ScrCurrent);
    }


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */


    /**
     * SectionsPagerAdapter mSectionsPagerAdapter;
     * The {@link ViewPager} that will host the section contents.
     * <p/>
     * ViewPager mViewPager;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
    }

    if(Operation.equals(“+”))

    {
        results = NumAf + NumBefore;
    }

    if(Operation.equals(“-”))

    {
        results = NumBefore - NumAf;
    }

    if(Operation.equals(“*”))

    {
        results = NumAf * NumBefore;
    }

    if(Operation.equals(“/”))

    {
        results = NumBefore / NumAf;
    }

    Scr.setText(String.valueOf(results));
}


private class ButtonClickListener implements onClickListener {
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clear: //clear
                Scr.setText(“0”);
                NumBefore = 0;
                Operation =“”;
                break;
            case R.id.numPlus:
                mycalcoperator(“ +”);
                break;
            case R.id.minus:
                mycalcoperator(“ -“);
                break;
            case R.id.multiply:
                mycalcoperator(“ *”);
                break;
            case R.id.divide:
                mycalcoperator(“ /”);
                break;
            case R.id.numCalc:
                results();
                break;
            default:
                String numb = ((Button) v).getText().toString();
                getKeyboard(numb);
                break;
        }

       /* // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }*/


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_activity1, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
/*
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    *//**
         * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
         * one of the sections/tabs/pages.
         *//*
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

    *//**
         * A placeholder fragment containing a simple view.
         *//*
    public static class PlaceholderFragment extends Fragment {
        *//**
         * The fragment argument representing the section number for this
         * fragment.
         *//*
        private static final String ARG_SECTION_NUMBER = "section_number";

        *//**
         * Returns a new instance of this fragment for the given section
         * number.
         *//*
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_activity1, container, false);
            return rootView;*/
    }

