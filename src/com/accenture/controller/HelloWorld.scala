package com.accenture.controller

object HelloWorld {
  
  def main (args: Array[String]){
    println("Hello World!");
    
     val cn =  new ComplexNumber(1.5,2.5)
     val cn2 =  new ComplexNumber2(3.5,4.5)
    
     println("Real part = " + cn.re())
     
     println("Imaginary part = " + cn.img())
     
     
      println("Real part = " + cn2.re)
     
     println("Imaginary part = " + cn2.img)
    
    }
}
