//Read headers
def map = message.getHeaders();
def temp = map.get("OrderNo")M


//Read Body
def bodyRead = message.getBody();


//Read properties 
def pro = message.getProperties();
def propTemp = pro.get("Check");

def finalStr = 'Concatenated_Value' + temp + propTemp; 


