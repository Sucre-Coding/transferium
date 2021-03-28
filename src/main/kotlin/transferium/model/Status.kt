package transferium.model

import java.time.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Status(val status: String = "OK")
