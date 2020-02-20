package services.impls

import entities.Coordinate
import services.PickUpLimiter

class DefaultPickUpLimiter(val limit: Double) extends PickUpLimiter {
  override def filter(origin: Coordinate, current: Coordinate): Boolean = {
    limit <= Coordinate.distance(origin, current)
  }
}
