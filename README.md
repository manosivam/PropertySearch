# PropertySearch
 
#important assumptions/comments and process flow is as ordered below,

#Assumption(1): if we ought to handle million(and growing data set) of properties, we need to have a efficient way of searching the property. 
	I assume we have index only on the location.Precomputation of indexes based on the Location (lat and long) should be done. 
	And I assume a solr index or elastic search functionality is available in place. (I don't have any prior experience in search indexers)

#Initial step would be form a search filter payload and send it to the index engine and get the list of properties on 10miles radius.  
(I have read apache solr is having geofilt to accomplish this)
 
 Based on the propertyId list that (we fetched now), we will find the valid and match percentage of the properties.
 And slaves and master will use merge sort and sort it based on the match percentage descending.  
 
#Assumption(2): 
Assume my system has a cluster of servers with a master and several slaves. Master is equipped with load balancing the load of among slave servers in parallel.
Master will split the received property IDs and delegate the load to its slaves. 
I also assume, we have read replicas of DB to efficiently read the property info.   
It is also responsible of collecting all the responses from the slaves.

# Please start reading the code from Search::doSearch method.