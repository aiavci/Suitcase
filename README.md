# Suitcase
[![Release](https://jitpack.io/v/com.guerinet/suitcase.svg)](https://jitpack.io/#com.guerinet/suitcase)

## Summary
Android utility classes and methods that I use in all of my projects. When off on a coding adventure, don't forget to pack your suitcase!

## Instructions
To include this in your project, you can add it with Gradle by using [JitPack](https://jitpack.io). Replace X.X.X below with the latest version found on the status badge above:

    repositories {
        maven { url "https://jitpack.io" }
    }

    def suitcase_version = 'X.X.X'

	dependencies {

        // Google Analytics Manager to send screens and events to GA, uses Google Play Services Analytics
        implementation "com.guerinet.suitcase:analytics:${suitcase_version}"

	    // Date utility methods and classes, uses AndroidThreeTen
	    implementation "com.guerinet.suitcase:date:${suitcase_version}"

        // DBFlow utility methods and classes, uses AndroidThreeTen and DBFlow
        implementation "com.guerinet.suitcase:db:${suitcase_version}"

        // Dialog utility methods, uses Material Dialogs
        implementation "com.guerinet.suitcase:dialog:${suitcase_version}"

        // I/O utility methods, uses Okio
        implementation "com.guerinet.suitcase:io:${suitcase_version}"

        // Logging utility methods and classes, uses Timber
        implementation "com.guerinet.suitcase:log:${suitcase_version}"

        // SharedPreferences utility methods and classes
        implementation "com.guerinet.suitcase:prefs:${suitcase_version}"

        // UI utility methods and classes
        implementation "com.guerinet.suitcase:ui:${suitcase_version}"

        // Basic utility methods and resources
        implementation "com.guerinet.suitcase:util:${suitcase_version}"
	}

* [Google Play Services](https://developers.google.com/android/guides/overview)
* [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
* [DBFlow](https://github.com/Raizlabs/DBFlow)
* [Material Dialogs](https://github.com/afollestad/material-dialogs)
* [Okio](https://github.com/square/okio)
* [Timber](https://github.com/JakeWharton/timber)

## Contributors
* [Julien Guerinet](https://github.com/jguerinet)

## Version History
See the [Change Log](CHANGELOG.md).

## Copyright
	 Copyright 2016-2018 Julien Guerinet

	 Licensed under the Apache License, Version 2.0 (the "License");
	 you may not use this file except in compliance with the License.
	 You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0

	 Unless required by applicable law or agreed to in writing, software
	 distributed under the License is distributed on an "AS IS" BASIS,
	 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 See the License for the specific language governing permissions and
	 limitations under the License.
