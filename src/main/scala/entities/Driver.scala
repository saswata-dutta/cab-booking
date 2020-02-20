package entities

sealed trait DriverStatus
case object OFF_DUTY extends DriverStatus
case object ON_DUTY extends DriverStatus

case class DriverId(value: Int) extends AnyVal
case class Driver(id: DriverId, status: DriverStatus)
