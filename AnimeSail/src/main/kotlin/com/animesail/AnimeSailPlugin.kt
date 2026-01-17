package com.animesail

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.extractors.Mp4Upload

@CloudstreamPlugin
class AnimeSailPlugin : Plugin() {

    override fun load(context: Context) {

        // All providers should be added in this manner. Please don't edit the providers list
        // directly.
        registerMainAPI(AnimeSail())
        registerExtractorAPI(Mp4Upload())
    }
}
