object SampleWorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s=4+2                                       //> s  : Int = 6
  println(s)                                      //> 6
  def add(a:Int,b:Int): Int= a+b                  //> add: (a: Int, b: Int)Int
  
  def subtract(a:Int,b:Int): Int= a-b             //> subtract: (a: Int, b: Int)Int
  add(1,2)                                        //> res0: Int = 3
  subtract(2,1)                                   //> res1: Int = 1
  
}