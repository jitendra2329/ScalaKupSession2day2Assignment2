package com.knoldus
import scala.util.{Try,Success,Failure}

trait Show[A] {
  def show(value: A): String
}

class LongShow[A] {

  def longValue(value: Long): String = {
    Try(value.isInstanceOf[Long]) match {
      case Success(result) => longShow.show(value)
      case Failure(exception) => exception.getMessage
    }
  }

  val longShow: Show[Long] = new Show[Long] {
    override def show(value: Long): String = value.toString
  }
}

class DoubleShow {

  def doubleValue(value: Double) : String = {
    Try(value.isInstanceOf[Double]) match {
      case Success(result) => doubleShow.show(value)
      case Failure(exception) => exception.getMessage
    }
  }

  val doubleShow: Show[Double] = new Show[Double] {
    override def show(value: Double): String = value.toString
  }
}

case class Position(xQuardinate: Int, yQuardinate: Int) {

  val position: Show[Position] = new Show[Position] {
    override def show(value: Position): String = value.toString
  }
}