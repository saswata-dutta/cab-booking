package entities

sealed trait CabStatus
case object FOR_HIRE extends CabStatus
case object BOOKED extends CabStatus
case object ON_TRIP extends CabStatus
case object OFF_DUTY extends CabStatus

case class CabState(driverId: DriverId,
                    status: CabStatus,
                    coordinate: Coordinate)
