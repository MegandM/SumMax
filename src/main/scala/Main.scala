import example.Lists

object Main extends App {
  // Check list
  val sample_list = List(1,3,2,4)
  // Check empty list (one expect, sum returns 0 and max throws Exception)
  //val sample_list = List()
  // Sum elements of the list
  println(Lists.sum(sample_list))
  // Max element of the list
  println(Lists.max(sample_list))
}