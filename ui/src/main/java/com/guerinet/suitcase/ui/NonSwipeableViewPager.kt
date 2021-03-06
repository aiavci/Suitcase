/*
 * Copyright 2016-2017 Julien Guerinet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.guerinet.suitcase.ui

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * A [ViewPager] that a user can't swipe through
 * @author Julien Guerinet
 * @since 2.0.0
 */
open class NonSwipeableViewPager : ViewPager {

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        // Do not register any touch events
        return false
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        // Do not register any touch events
        return false
    }

}