package com.accenture.controller

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object DateTimeUtil {
  
  def main(args: Array[String]){
    
    val now =  new Date
    val dateFormatCN = getDateInstance(LONG, Locale.CANADA)
    val dateFormatFR = getDateInstance(LONG, Locale.FRENCH)
        
    println(dateFormatCN format now)
    println(dateFormatFR format now)
  }
  
}