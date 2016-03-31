package com.qiao.playmuke;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

/**
 * Created by Administrator on 2016/3/31.
 */
public class MCVideoView extends VideoView {

    public MCVideoView(Context context) {
        this(context,null);
    }

    public MCVideoView(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public MCVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }

    public void playVideo(Context context,Uri uri){
        if(uri==null){
            throw new IllegalArgumentException("Uri can not be null");
        }
        //璁剧疆鎾斁璺緞
        setVideoURI(uri);
        //寮�濮嬫挱鏀�
        start();
        setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                //璁剧疆寰幆鎾斁
                mp.setLooping(true);
            }
        });
        setOnErrorListener(new MediaPlayer.OnErrorListener() {

            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                return true;
            }
        });
    }
}
