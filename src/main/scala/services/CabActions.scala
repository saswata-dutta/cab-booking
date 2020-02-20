package services

import entities.{Cab, CabId, CabState, Coordinate, DriverId}

trait CabActions {
  // Post /cabs/<cabId>/location
  def heartBeat(cabId: CabId, current: Coordinate): CabState

  // Get /cabs?nearby=<lat,lon>
  def getNearby(origin: Coordinate): Seq[Cab]

  // Post /cabs/<cabId>/assign/<driverId>
  def assignDriver(cabId: CabId, driverId: DriverId): Option[CabState]

  // Delete /cabs/<cabId>/assign/<driverId>
  def unassignDriver(cabId: CabId, driverId: DriverId): Option[CabState]
}
