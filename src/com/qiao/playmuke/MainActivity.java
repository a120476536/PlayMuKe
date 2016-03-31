package com.qiao.playmuke;

import java.util.ArrayList;
import java.util.List;

import com.qiao.fragment.MainFragment;
import com.qiao.fragment.SecondFragment;
import com.qiao.fragment.ThrFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {

	private List<Fragment> fragmentList = new ArrayList<Fragment>();
	private ViewPager vp_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp_2 = (ViewPager) findViewById(R.id.vp_2);
        fragmentList.add(new MainFragment());
        fragmentList.add(new SecondFragment());
        fragmentList.add(new ThrFragment());
        vp_2.setAdapter(new MyPagerAdaper(getSupportFragmentManager()));
//        fragmentList.add(new Thr);
    }

    
    class MyPagerAdaper extends FragmentStatePagerAdapter{

		public MyPagerAdaper(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			return fragmentList.get(arg0);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return fragmentList.size();
		}
    	
    }

}
