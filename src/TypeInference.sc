object TypeInference {
 println("Welcome to the Scala worksheet")        //> Welcome to the Scala worksheet
val num=23                                        //> num  : Int = 23
val dobleval=35.45                                //> dobleval  : Double = 35.45
List(1,3,4,5)                                     //> res0: List[Int] = List(1, 3, 4, 5)
List(1,true)                                      //> res1: List[AnyVal] = List(1, true)
List(1,2.0,true,"hi")                             //> res2: List[Any] = List(1, 2.0, true, hi)
def add(x:Int)= x+1                               //> add: (x: Int)Int
def addf(x:Int)= x + 2.0                          //> addf: (x: Int)Double
def subf(x:Int)= if(x>0) 1 else "negative num"    //> subf: (x: Int)Any
}