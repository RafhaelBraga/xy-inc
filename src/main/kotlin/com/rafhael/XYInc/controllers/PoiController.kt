package com.rafhael.XYInc.controllers

import com.rafhael.XYInc.documents.Poi
import com.rafhael.XYInc.dtos.PoiDto
import com.rafhael.XYInc.services.PoiService
import org.springframework.beans.factory.annotation.Value
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import java.lang.Math.pow
import kotlin.math.sqrt

@RestController //Springboot
@RequestMapping("/poi")
class PoiController(val poiService: PoiService) {

    @Value("\${paginacao.qtd_por_pagina}") //application properties
    val qtdPorPagina:Int = 10

    @PostMapping("/add")
    fun adicionar(@RequestBody poiDto: PoiDto, result:BindingResult){//json->dto
        val poi: Poi = converterDtoParaPoi(poiDto)
        if(poi.x!! >=0 && poi.y!! >=0) {
            poiService.addPoi(poi)
        }
    }

    fun converterDtoParaPoi(poiDto: PoiDto): Poi{
        return Poi(poiDto.poiName,poiDto.x,poiDto.y)
    }

    @GetMapping("/list")
    fun listar( ):List<Poi>?{
        return poiService.listAll()
    }

    @GetMapping("/near")
    fun listByProximity(@RequestBody poiDto: PoiDto, result:BindingResult):List<Poi>?{
        return poiService.listNear(poiDto)
    }

    @DeleteMapping("/clear")
    fun clearAll(){
        poiService.clear()
    }
}