package entities

case class Coordinate(lat: Double, lon: Double)

object Coordinate {
  def distance(lhs: Coordinate, rhs: Coordinate): Double = {
    val x = math.pow(lhs.lat - rhs.lat, 2)
    val y = math.pow(lhs.lon - rhs.lon, 2)
    math.sqrt(x + y)
  }
}
