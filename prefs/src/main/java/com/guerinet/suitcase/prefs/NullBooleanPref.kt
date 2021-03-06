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

package com.guerinet.suitcase.prefs

import android.content.SharedPreferences

/**
 * Preference utility class for nullable [Boolean]s
 * @author Julien Guerinet
 * @since 2.6.0
 */
open class NullBooleanPref(prefs: SharedPreferences, key: String, defaultValue: Boolean?) :
        BasePref<Boolean?>(prefs, key, defaultValue) {

    override fun get(): Boolean? {
        // If it is set, get it. If not, use the default value
        return if (isSet()) {
            prefs.getBoolean(key, true)
        } else {
            defaultValue
        }
    }

    override fun set(value: Boolean?) {
        // If the value is null, clear out the pref
        if (value == null) {
            clear()
        } else {
            prefs.edit().putBoolean(key, value).apply()
        }
    }
}