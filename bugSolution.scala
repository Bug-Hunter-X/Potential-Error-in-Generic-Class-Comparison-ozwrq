```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    this.value match {
      case x: AnyRef => x.equals(other.value)
      case x => x == other.value
    }
  }
}
```