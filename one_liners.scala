val wordList = List("scala", "akka", "play framework", "sbt", "typesafe")
val string = "This is an example tweet talking about scala and sbt."

(wordList.foldLeft(false)( _ || string.contains(_) ))
wordList.exists(string.contains)
