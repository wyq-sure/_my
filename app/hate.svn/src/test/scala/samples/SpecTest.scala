package samples

import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack
import org.scalatest.Spec
import org.scalatest.WordSpec
import org.scalatest.FlatSpec

class StackSpec extends Spec with ShouldMatchers {

  describe("A Stack") {

    describe("(when empty)") {

      val stack = new Stack[Int]

      it("should be empty") {
        stack should be ('empty)
      }

      it("should complain when popped") {
        evaluating { stack.pop() } should produce [NoSuchElementException]
      }
    }
  }
}

class StackWordSpec extends WordSpec with ShouldMatchers {

  "A Stack" when {

    "empty" should {

      val stack = new Stack[Int]

      "be empty" in {
        stack should be ('empty)
      }

      "complain when popped" in {
        evaluating { stack.pop() } should produce [NoSuchElementException]
      }
    }
  }
}


class StackFlatSpec extends FlatSpec with ShouldMatchers {

  val stack = new Stack[Int]

  "A Stack (when empty)" should "be empty" in {
    stack should be ('empty)
  }

  it should "complain when popped" in {
    evaluating { stack.pop() } should produce [NoSuchElementException]
  }
}