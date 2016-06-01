package com.accenture.controller

object TimerExample {

  val message = 1
  
  def oncePerSecond(callback: () => Unit) {

    val count = 10

    while (count > 0) {



      callback()
      Thread sleep 1000
    }

  }
  
  def task(){
    
    println("life is fun - " + message)
    
    message + 1
  }
  
  def main(args:  Array[String]){
    oncePerSecond { () => task }
  }
}