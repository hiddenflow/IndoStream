package com.dutamovie

import com.lagradost.cloudstream3.extractors.JWPlayer
import com.lagradost.cloudstream3.extractors.VidhideExtractor

class Ryderjet: VidhideExtractor() {
    override var mainUrl = "https://ryderjet.com"
}

class Embedfirex : JWPlayer() {
    override var name = "embedpyrox"
    override var mainUrl = "https://embedpyrox.xyz"
}
