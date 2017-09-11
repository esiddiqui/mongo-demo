# mongo-demo




# Setup Mongo DB & basics


## Download
>> Download mongodb from web for windows
>> install mongodb
>> create path for storage c:\mongodb\data

## Setup configuration
>> goto mongodb installation location e.g %>cd c:\Program Files\MongoDb\Server\3.4\bin
>> mongod --dbpath "c:\mongodb\data"
-- the mongo server will start and data location set to above

## Start mongo server
>> open another console and goto mongodb installation location e.g %>cd c:\Program Files\MongoDb\Server\3.4\bin
>> start mongo.exe console
>> Insert a record in test db: 

## Save
% db.test.save( {name:"ehtesham" })
% db.test.save( {name:"sally boy" })

## Find
% db.test.find()
OR
% db.test.find().pretty()

### Serch by a field:
% db.test.find({ name: "sally boy"}).pretty()

## Create a new DB

% use ehteshamdb

## List DBs
% db
show all dbs
% show dbs

## Add new table
db.employee.insert({ id:201, name:"es230022", fullName:"Ehtesham Siddiqui", groupId:1, dataGroupId:12})
db.employee.insert({ id:201, name:"sally", fullName:"Salman Siddiqui", groupId:2, dataGroupId:12})
db.employee.insert({ id:1, name:"dcm", fullName:"Administrator", groupId:1, dataGroupId:1})

## Search for records
db.employee.find({ id:1 })

## Search for OR relationship
db.employee.find({ $or : [{id:1},{id:201}] });
db.employee.find({ dataGroupId: 12 });

etc etc

## Update
.update() update a document using >> db.mycol.update({'title':'??'},{$set:{'title':'??'}})
save() - replace a document

## Remove a document
>db.COLLECTION_NAME.remove(DELLETION_CRITTERIA)
>db.COLLECTION_NAME.remove(DELETION_CRITERIA,1) //remove only first


## Search documents:
.find()
.find().pretty()
.find().limit(2)
.find().limit(1).skip()


## Spring client

goto start.spring.io

start a new project 

Group: com.es.mongo
Artifact: mongo-demo
Depdendencies: Jersey (JAX_RS) MongoDB