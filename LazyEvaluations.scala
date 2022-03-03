object LazyEvaluations extends App{
  // lazy delays the evaluation of values
  lazy val x :Int = {
    println("Hello")
    42
  }
  println(x)
  println(x)
  def sideEffectCondition: Boolean={
    println("Satya")
    true
  }
  def simpleCondition : Boolean = false

  lazy val lazy_val = sideEffectCondition

  println(if(simpleCondition && lazy_val) "YES" else "NO") // when it finds simpleCondition returning false it doesn't care for lazy_val to be evaluated

}