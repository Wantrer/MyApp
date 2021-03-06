package com.lvlw.myapp.utils;

import com.melnykov.fab.FloatingActionButton;
import android.view.View;

import solid.ren.skinlibrary.attr.base.SkinAttr;
import solid.ren.skinlibrary.utils.SkinResourcesUtils;

/**
 * Created by Wantrer on 2017/4/9 0009.
 */

public class FloatingActionButtonColorNormalAtrr extends SkinAttr{
    @Override
    public void apply(View view) {
        if (view instanceof FloatingActionButton) {
            FloatingActionButton fab = (FloatingActionButton) view;
            if (RES_TYPE_NAME_COLOR.equals(attrValueTypeName)) {
                int color = SkinResourcesUtils.getColor(attrValueRefId);
                fab.setColorNormal(color);
            }
        }
    }
}
