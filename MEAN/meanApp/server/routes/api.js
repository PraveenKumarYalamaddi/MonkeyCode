const express = require('express');
const router = express.Router();
const mongoose = require('mongoose');
const db = "mongodb://praveenlist:pwpraveen@ds139929.mlab.com:39929/videoplayer";
const Video = require('../models/video.js');
mongoose.Promise = global.Promise;
mongoose.connect(db,function(err){
    if(err){
        console.error("Error |  "+err);
    }
});
router.get('/videos',function(req,res){
    res.send('Get request for all videos');
    Video.find({})
    .exec(function(err,videos){
        if(err){
            console.error("Error while retriving videos | "+err)
        }else{
            res.json(videos);
        }
    })
});



module.exports = router;