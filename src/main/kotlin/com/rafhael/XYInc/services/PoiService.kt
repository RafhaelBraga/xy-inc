package com.rafhael.XYInc.services

import com.rafhael.XYInc.documents.Poi
import com.rafhael.XYInc.dtos.PoiDto

interface PoiService {

    fun listAll(): List<Poi>?

    fun addPoi(poi: Poi): Poi

    fun listNear(poiDto: PoiDto): List<Poi>?

    fun clear()
}