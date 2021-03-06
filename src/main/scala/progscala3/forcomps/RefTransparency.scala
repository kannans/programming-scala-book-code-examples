// src/main/scala/progscala3/forcomps/RefTransparency.scala
package progscala3.forcomps

object RefTransparency:
  def addInts(s1: String, s2: String): Int = s1.toInt + s2.toInt

  def addInts2(s1: String, s2: String): Either[String,Int] =
    try
      Right(s1.toInt + s2.toInt)
    catch
      case nfe: NumberFormatException => Left("NFE: "+nfe.getMessage)
