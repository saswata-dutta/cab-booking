package services

import entities._

trait RiderActions {
  // Post /riders
  // ignoring other meta data like name etc
  def register(): Rider

  // Post /riders/<riderId>/book
  def book(riderId: RiderId, origin: Coordinate): Option[Ride]

  // Get /riders/<riderId>/rides
  def getRides(riderId: RiderId): Seq[Ride]

  // Get /riders/<riderId>/rides/<rideId>
  def getRide(riderId: RiderId, rideId: RideId): Option[Ride]
}
