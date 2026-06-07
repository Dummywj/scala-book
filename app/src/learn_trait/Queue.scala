package learn_trait

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue:
    def get(): Int
    def put(x: Int) : Unit

class BasicIntQueue extends IntQueue:
    private val buf = ArrayBuffer.empty[Int] 
    def get() = buf.remove(0) 
    def put(x: Int) = buf += x

trait Doubling extends IntQueue:
    abstract override def put(x: Int) = super.put(2 * x)

class MyQueue extends BasicIntQueue, Doubling

object QueueTest extends App:
    val q = new BasicIntQueue
    q.put(10)
    q.put(20)
    println((q.get(), q.get()))

    val myq = new MyQueue
    myq.put(10)
    println(myq.get())
