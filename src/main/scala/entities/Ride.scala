package entities

sealed trait RideStatus
case object BOOKED extends RideStatus
case object IN_PROGRESS extends RideStatus
case object COMPLETE extends RideStatus

case class RideId(value: Int) extends AnyVal
case class Ride(id: RideId,
                riderId: RiderId,
                cabId: CabId,
                driverId: DriverId,
                startTs: Long,
                stopTs: Option[Long],
                origin: Coordinate,
                destination: Option[Coordinate],
                status: RideStatus)
