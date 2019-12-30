package com.rafhael.XYInc.dtos

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PoiDto (
    @get:NotEmpty(message = "Can not be empty.")
    val poiName: String = "",

    @get:NotEmpty(message = "Can not be empty.")
    val x: Int = 0,

    @get:NotEmpty(message = "Can not be empty.")
    val y: Int = 0,
    var dmax: Int = 0,
    var id: String? = null
)