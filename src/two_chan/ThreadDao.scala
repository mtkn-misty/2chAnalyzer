package two_chan

import com.mongodb.casbah.commons.MongoDBObject

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoOptions

/**
 * スレッドのデータをMongoDBに格納するDAO
 */
object ThreadDao extends MongoDao {

  /**
   * threadコレクションの初期化
   */
  val collection = db("vipthread")
  collection.dropCollection()

  def insertRes(resVo: ResVo): Unit = { 

    val obj = MongoDBObject("subject" -> resVo.subject, "name" -> resVo.name, "mail" -> resVo.mail,
      "submitDate" -> resVo.submitDate, "comment" -> resVo.comment)
    collection.insert(obj)
  }
}