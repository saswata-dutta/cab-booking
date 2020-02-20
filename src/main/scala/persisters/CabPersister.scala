package persisters

import entities.{Cab, CabId}

trait CabPersister {
  def create(): Cab
  def find(riderId: CabId): Option[Cab]
}
