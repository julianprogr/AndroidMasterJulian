package com.example.androidmaster.settings

import android.os.CombinedVibration

data class SettingsModel(
    var volume: Int,
    var bluetooth: Boolean,
    var darkMode: Boolean,
    var vibration: Boolean
)