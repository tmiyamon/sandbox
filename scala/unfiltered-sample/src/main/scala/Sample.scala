import unfiltered.request._
import unfiltered.response._

object SillyStore extends unfiltered.filter.Plan {
  @volatile private var store = Map.empty[String, Array[Byte]]
  def intent = {
    case req @ Path(Seg("record" :: id :: Nil)) => req match {
      case GET(_) =>
        store.get(id).map(ResponseBytes).getOrElse {
          NotFound ~> ResponseString("No record: " + id)
        }
      case PUT(_) =>
        SillyStore.synchronized {
          store = store + (id -> Body.bytes(req))
        }
        Created ~> ResponseString("Created record: " + id)
      case DELETE(_) =>
        SillyStore.synchronized {
          store.get(id) match {
            case Some(v) =>
              store = store - id
              "Remove record: " + id
              ResponseString("Removed record: " + id)
            case None =>
              NotFound ~> ResponseString("No record: " + id)
          }
        }
      case _ =>
        MethodNotAllowed ~> ResponseString("Must be GET or PUT")
    }
  }
}



// vim: set ts=4 sw=4 et:
