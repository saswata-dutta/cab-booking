package persisters

import entities.{Rider, RiderId}

trait RiderPersister {
  def create(): Rider
  def find(riderId: RiderId): Option[Rider]
}
