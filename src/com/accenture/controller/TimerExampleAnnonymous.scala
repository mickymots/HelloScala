package com.accenture.controller

object TimerExampleAnnonymous {
  
  def oncePerSecond(callback: () => Unit){
    
    while(true){
      callback()
      Thread.sleep(500)
    }
  }
  
  
  def main(args: Array[String]){
    
    oncePerSecond(() => 
      println("hey I am annonymous"))
  }

}