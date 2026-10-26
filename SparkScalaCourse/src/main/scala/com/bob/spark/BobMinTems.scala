package com.bob.spark

import org.apache.spark._
import org.apache.log4j._
import scala.math.min

object BobMinTems{

def parseLine(line:String): (String, String, Float) = {
    var fields = line.split(",")
    var stationId = fields(0)
    var entryType = fields(2)
    var temp = fields(3).toFloat * 0.1f * (9.0f / 5.0f) + 32.0f
    (stationId, entryType, temp)
}
    def main(args: Array[String]){
        Logger.getLogger("org").setLevel(Level.ERROR)

        val sc = new SparkContext("local[*]", "MinTems")
        
        val lines = sc.textFile("data/1800.csv")

    }


}