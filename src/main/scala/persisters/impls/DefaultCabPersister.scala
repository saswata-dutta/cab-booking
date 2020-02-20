package persisters.impls

import entities.{Cab, CabId}
import persisters.CabPersister

import scala.collection.mutable.ArrayBuffer

object DefaultCabPersister extends CabPersister {
  private var counter: Int = 0

  private val cabs = ArrayBuffer.empty[Cab]

  override def create(): Cab = {
    counter += 1
    val cab = Cab(CabId(counter))
    cabs += cab

    cab
  }

  override def find(cabId: CabId): Option[Cab] = {
    cabs.find(_.id == cabId)
  }
}
