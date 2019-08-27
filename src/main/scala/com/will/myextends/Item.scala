package com.will.myextends

class Item(val description: String, val price: Double) {

  final override def equals(obj: Any): Boolean = {
    obj.isInstanceOf[Item] && {
      val that = obj.asInstanceOf[Item]
      description == that.description && price == that.price
    }
  }

  final override def hashCode(): Int = (description, price).##
}
