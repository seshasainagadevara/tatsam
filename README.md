# tatsam
tatsam rest api demo using java

#rest api for priority areas
1. Connection
2. Relationships
3. Career
4. Wealth

# endpoint 
  GET / - WELCOME NOTE
  
  GET /areas - send list of all priority areas
  Response:
     
     {
     [
    {
        "priorityId": 1,
        "priorityAreaName": "Connections",
        "priorityRating": 0
    },
    {
        "priorityId": 2,
        "priorityAreaName": "Relationships",
        "priorityRating": 0
    },
    {
        "priorityId": 3,
        "priorityAreaName": "Career",
        "priorityRating": 0
    },
    {
        "priorityId": 4,
        "priorityAreaName": "Wealth",
        "priorityRating": 0
    }
]
},

  GET /MyProfile/[userid] - returns user priority
     Response:
     
     
      { 
      [
    {
        "priorityId": 1,
        "priorityAreaName": "Connections",
        "priorityRating": 2
    },
    {
        "priorityId": 2,
        "priorityAreaName": "Relationships",
        "priorityRating": 3
    },
    {
        "priorityId": 3,
        "priorityAreaName": "Career",
        "priorityRating": 5
    },
    {
        "priorityId": 4,
        "priorityAreaName": "Wealth",
        "priorityRating": 5
    },
]
},


  POST /add - adds area with priorty and rating
     Request:
        
        {
    "userID": "seshasai549",
    "priorities": [
    {
        "priorityId": 1,
        "priorityAreaName": "Connections",
        "priorityRating": 2
    },
    {
        "priorityId": 2,
        "priorityAreaName": "Relationships",
        "priorityRating": 3
    },
    {
        "priorityId": 3,
        "priorityAreaName": "Career",
        "priorityRating": 5
    },
    {
        "priorityId": 4,
        "priorityAreaName": "Wealth",
        "priorityRating": 5
    }
]
}
        
     
  
  
