package com.qiao.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qiao.playmuke.MCVideoView;
import com.qiao.playmuke.R;


/**
 * Created by Administrator on 2016/3/29.
 */
public class ThrFragment extends BaseFragment {

	MCVideoView fragmentText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, null);
        fragmentText = (MCVideoView) view.findViewById(R.id.fragment_text);
        fragmentText.playVideo(mContext, Uri.parse("android.resource://" + getActivity().getApplicationContext().getPackageName() + "/" + R.raw.thr));

        return view;
    }
}
