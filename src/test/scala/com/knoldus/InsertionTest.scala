package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class InsertionTest extends AnyFunSuite {
  val sortList = new Insertion

  test("give an empty list if we are passing an empty list") {
    assert(List() == sortList.insertionSort(List()))
  }
  test("give the same list if the given list have all element same") {
    assert(List(1, 1, 1, 1) == sortList.insertionSort(List(1, 1, 1, 1)))
  }
  test("give the sorted list of given unsorted list") {
    assert(List(1, 2, 3, 4, 5, 6) == sortList.insertionSort(List(2, 4, 6, 1, 5, 3)))
  }
}
