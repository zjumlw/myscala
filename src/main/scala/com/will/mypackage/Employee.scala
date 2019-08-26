package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double): Double = value * rate / 100
    }

    package impatient {
      class Employee(var salary: Double = 0) {
        def giveRaise(rate: Double): Unit = {
          salary += Utils.percentOf(salary, rate)
        }
      }

      class Manager {
        val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Employee]
      }
    }
  }
}

package net {
  package bigjava {
    class Counter
  }
}
