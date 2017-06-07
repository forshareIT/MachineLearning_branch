package com.ustc.aaron.learningtest.custom;


import android.content.Context;
import android.net.Uri;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2017/6/6 0006 下午 11:42.
 */

public class MyCropImageView extends FrameLayout {


    /**
     * Task used to load bitmap async from UI thread
     */
    private WeakReference<BitmapLoadingWorkerTask> mBitmapLoadingWorkerTask;

    /**
     * Task used to crop bitmap async from UI thread
     */
    private WeakReference<BitmapCroppingWorkerTask> mBitmapCroppingWorkerTask;

    public MyCropImageView(@NonNull Context context) {
        this(context,null);
    }

    public MyCropImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyCropImageView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void setImageUriAsync(Uri uri)
    {
//        if (uri != null) {
//            BitmapLoadingWorkerTask currentTask = mBitmapLoadingWorkerTask != null ? mBitmapLoadingWorkerTask.get() : null;
//            if (currentTask != null) {
//                // cancel previous loading (no check if the same URI because camera URI can be the same for different images)
//                currentTask.cancel(true);
//            }
//
//            // either no existing task is working or we canceled it, need to load new URI
//            clearImageInt();
//            mCropOverlayView.setInitialCropWindowRect(null);
//            mBitmapLoadingWorkerTask = new WeakReference<>(new BitmapLoadingWorkerTask(this, uri));
//            mBitmapLoadingWorkerTask.get().execute();
//            setProgressBarVisibility();
//        }
    }


}
