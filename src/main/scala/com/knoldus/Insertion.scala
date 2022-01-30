package com.knoldus

class Insertion {
  def insertionSort(list: List[Int]): List[Int] =
    if (list.isEmpty) Nil
    else insert(list.head, insertionSort(list.tail))

  def insert(element: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty || element < list.head) element :: list
    else list.head :: insert(element, list.tail)
  }
}