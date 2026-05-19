public Account(String requestedName) {
    if (isAvailable(requestedName)) {
        username = requestedName; 
    } else {
        String copy = requestedName; 
        requestedName = requestedName + "1";
        int i = 2; 
        while(!(isAvailable(requestedName))) {
            requestedName = copy + i; 
            i++; 
        }
        username = requestedName; 
    }
}

public String getShortenedName() {
    String newWord = username; 
    while(newWord.indexOf("-")!=-1) {
        int index = newWord.indexOf("-");
        newWord = newWord.substring(0,index-1) + newWord.substring(index+1); 
    }
    return newWord; 
}
