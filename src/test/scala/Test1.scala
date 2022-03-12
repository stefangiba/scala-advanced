import org.junit.Test
import org.junit.Assert.*

class Test1:
  @Test
  def messageIsExpected(): Unit =
    assertEquals("I was compiled by Scala 3. :)", msg)

  @Test
  def messageIsExpectedAsWell(): Unit =
    assertEquals("I was compiled by Scala 3. :)", msg)
