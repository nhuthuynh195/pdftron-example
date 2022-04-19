package com.pdftron.reactnative.nativeviews;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pdftron.reactnative.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.TextView;

import com.pdftron.collab.ui.viewer.CollabViewerTabHostFragment2;

public class RNCollabViewerTabHostFragment extends CollabViewerTabHostFragment2 {

    private RNPdfViewCtrlTabHostFragment.RNHostFragmentListener mListener;

    public void setRNHostFragmentListener(RNPdfViewCtrlTabHostFragment.RNHostFragmentListener listener) {
        mListener = listener;
    }
    //HACK customize button switch annotation
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSwitcherButton = mToolbar.findViewById(R.id.switcher_button);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, 
        Toolbar.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        TextView title = mSwitcherButton.findViewById(R.id.title);
				Typeface bold = ResourcesCompat.getFont(getContext(), R.font.axiforma_semi_bold);
				title.setTypeface(bold);
        title.setTextSize(20);
        mSwitcherButton.setLayoutParams(layoutParams);
        if (mListener != null) {
            mListener.onHostFragmentViewCreated();
        }
    }
    // end customize
}
