package two_chan

object SubjectsDao {
	def insertSubject(subject: String, url: String): Unit ={
		print(subject + ", " + url + "\n")
	}
}