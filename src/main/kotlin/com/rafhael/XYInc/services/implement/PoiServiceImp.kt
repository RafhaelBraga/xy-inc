package com.rafhael.XYInc.services.implement

import com.rafhael.XYInc.documents.Poi
import com.rafhael.XYInc.dtos.PoiDto
import com.rafhael.XYInc.repositories.PoiRepository
import com.rafhael.XYInc.services.PoiService
import org.springframework.stereotype.Service
import kotlin.math.sqrt

@Service
class PoiServiceImp(val poiRepository: PoiRepository): PoiService {

    override fun listAll(): List<Poi>? = poiRepository.findAll()
    override fun addPoi(poi: Poi): Poi = poiRepository.save(poi)
    override fun clear()
    {
        poiRepository.deleteAll()
    }
    override fun listNear(poiDto: PoiDto): List<Poi>?{
        val lista: List<Poi>? = poiRepository.findAll()
        var listaFinal:MutableList<Poi>? =  mutableListOf()
        if (lista != null) {
            for(each in lista){
                if(distanceBTP(each, poiDto)  <= poiDto.dmax){
                    listaFinal?.add(each)
                }
            }
        }
        return listaFinal
    }
    fun distanceBTP(poi: Poi, poiDto: PoiDto): Double//distance between two points
    {
        return sqrt((Math.pow((poi.x!!-poiDto.x).toDouble(), 2.0) + Math.pow ((poi.y!!-poiDto.y).toDouble(),2.0)))
    }
}