package com.will.myobject

object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo(): Unit = {}

  override def redo(): Unit = {}

  val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
}
