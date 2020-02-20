package persisters

import entities.{CabId, CabState, CabStatus, Coordinate}

trait CabStatePersister {
  def create(): CabState
  def findAll(): Seq[CabState]
  def update(cabId: CabId, cabStatus: CabStatus)
  def update(cabId: CabId, location: Coordinate)
  def delete()
}
