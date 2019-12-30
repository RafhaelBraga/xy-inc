package com.rafhael.XYInc.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Poi(
        val poiName: String,
        val x: Int? = 0,
        val y: Int? = 0,
        @Id val id: String? = null
)