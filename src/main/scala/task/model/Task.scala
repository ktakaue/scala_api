package task.model

import java.util.UUID

case class Task(
  id: UUID,
  title: String,
  description: Option[String] = None,
  completed: Boolean = false
)