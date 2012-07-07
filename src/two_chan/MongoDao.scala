package two_chan

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoOptions

/**
 * MongoDBにデータを格納するための親DAO
 * すべてのMongoDBにアクセスするDAOはこのクラスを継承する
 */
class MongoDao {

  /**
   * Mongodbの初期化
   */
  
  val con = MongoConnection("localhost:27017")
  val db = con("2chData")
}