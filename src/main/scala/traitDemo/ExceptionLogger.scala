package traitDemo

trait ExceptionLogger extends Exception {//特质也可以扩展类，特质的超类变为Exception

  def log(log: String): Unit = {
    println(getMessage+"========")
  }

}
