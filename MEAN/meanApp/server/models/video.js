const mongoose = require('mongoose');
const schema = mongoose.Schema;
const videoSchema = new schema({
    tittle:String,
    url:String,
    description:String
});
module.exports = mongoose.model('video',videoSchema,'videos');