package persisters.impls

import entities.{Rider, RiderId}
import persisters.RiderPersister

import scala.collection.mutable.ArrayBuffer

object DefaultRiderPersister extends RiderPersister {
  private var counter: Int = 0

  private val riders = ArrayBuffer.empty[Rider]

  override def create(): Rider = {
    counter += 1
    val rider = Rider(RiderId(counter))
    riders += rider

    rider
  }

  override def find(riderId: RiderId): Option[Rider] = {
    riders.find(_.id == riderId)
  }
}
