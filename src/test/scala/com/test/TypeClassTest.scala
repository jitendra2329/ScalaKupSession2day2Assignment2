package com.test
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.{LongShow,DoubleShow,Position}
class TypeClassTest extends AnyFlatSpec {

  val longObject = new LongShow
  val doubleObject = new DoubleShow

  "Long values " should "show String version of long values " in {
    val actualResult = longObject.longValue(1223233)
    val aspectedResult = "1223233"
    assert(actualResult.isInstanceOf[String])
    assert(actualResult == aspectedResult)
  }

  "Double values " should "show String version of Double values " in {
    val actualResult = doubleObject.doubleValue(1223233.22)
    val aspectedResult = "1223233.22"
    assert(actualResult.isInstanceOf[String])
    assert(actualResult == aspectedResult)
  }

  "Position " should "be valid " in {
    val positionObject = Position(2,9)
    val actualResult  = positionObject.position.show(positionObject)
    val aspectedResult = "Position(2,9)"
    assert(actualResult == aspectedResult)
  }
}
