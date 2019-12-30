package com.rafhael.XYInc.repositories

import com.rafhael.XYInc.documents.Poi
import org.springframework.data.mongodb.repository.MongoRepository


interface PoiRepository: MongoRepository<Poi, String> { 
}