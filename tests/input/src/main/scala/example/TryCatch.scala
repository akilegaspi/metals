package example

class TryCatch {
  try {
    val x = 2
    x + 2
  } catch {
    case t: Throwable =>
      t.printStackTrace()
  } finally {
    val text = ""
    text + ""
  }
}
