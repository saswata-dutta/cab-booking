package services.impls

import entities.{Coordinate, Ride, RideId, Rider, RiderId}
import services.RiderActions

class DefaultRiderActions extends RiderActions  {
  override def register(): Rider = ???

  override def book(riderId: RiderId, origin: Coordinate): Option[Ride] = ???

  override def getRides(riderId: RiderId): Seq[Ride] = ???

  override def getRide(riderId: RiderId, rideId: RideId): Option[Ride] = ???
}
