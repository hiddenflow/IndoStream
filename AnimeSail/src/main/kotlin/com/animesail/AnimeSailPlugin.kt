package com.animesail

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.extractors.Geodailymotion
import com.lagradost.cloudstream3.extractors.Krakenfiles
import com.lagradost.cloudstream3.extractors.Mp4Upload
import com.lagradost.cloudstream3.extractors.MyVidPlay
import com.lagradost.cloudstream3.extractors.MixDropAg
import com.lagradost.cloudstream3.extractors.PixelDrain

@CloudstreamPlugin
class AnimeSailPlugin : Plugin() {

    override fun load(context: Context) {

        // All providers should be added in this manner. Please don't edit the providers list
        // directly.
        registerMainAPI(AnimeSail())
        registerExtractorAPI(Geodailymotion())
        registerExtractorAPI(Krakenfiles())
        registerExtractorAPI(Mp4Upload())
        registerExtractorAPI(MixDropAg())
        registerExtractorAPI(PixelDrain())
    }
}
