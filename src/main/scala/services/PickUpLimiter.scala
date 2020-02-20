package services

import entities.Coordinate

trait PickUpLimiter {
  def filter(origin: Coordinate, current: Coordinate): Boolean
}
