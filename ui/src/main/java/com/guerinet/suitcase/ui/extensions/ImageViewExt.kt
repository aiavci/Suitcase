/*
 * Copyright 2016-2018 Julien Guerinet
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

package com.guerinet.suitcase.ui.extensions

import android.support.annotation.ColorInt
import android.widget.ImageView

/**
 * [ImageView] extensions
 * @author Julien Guerinet
 * @since 2.3.0
 */

/**
 * Sets the tint with the given [color]
 */
fun ImageView.setTint(@ColorInt color: Int) {
    setImageDrawable(drawable.setTintCompat(color))
}