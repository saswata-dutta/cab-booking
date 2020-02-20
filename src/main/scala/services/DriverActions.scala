package services

import entities.{Driver, DriverId, Ride}

trait DriverActions {
  // Post /drivers
  // ignoring other meta data like name etc
  def register(): Driver

  // Post /drivers/<driverId>/end-ride
  def endRide(driverId: DriverId): Option[Ride]

  // Post /drivers/<driverId>/off
  def goOffDuty(driverId: DriverId): Option[Driver]

  // Post /drivers/<driverId>/on
  def goOnDuty(driverId: DriverId): Option[Driver]
}
