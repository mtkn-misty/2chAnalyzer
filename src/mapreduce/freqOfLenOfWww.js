var map = function(){
	var wwws = this.comment.match(/w+/g);
	for (var i in wwws) {
		emit(wwws[i].length, 1);
	}
}

var reduce = function(key, values){
	return {
		len: key,
		freq: values.length
	};
}

db.outputs.drop();
db.vipthread.mapReduce(map, reduce, {
    	'out': 'outputs'
});

// # mongo localhost/2chData freqOfLenOfWww.js 


