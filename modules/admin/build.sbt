Common.serviceSettings("admin", messagesFilesFrom = Seq("common", "admin"))

// Add here the specific settings for this module


libraryDependencies ++= Common.commonDependencies ++: Seq(
	"org.webjars" % "bootswatch-superhero" % "3.3.5+4"
	// Add here the specific dependencies for this module:
	// jdbc,
	// anorm
)

scalariformSettings