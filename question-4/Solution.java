public int getPointsForRow(int targetRow) {
    boolean word = true; 
    int sum =0; 
    for (int j = 0; j < board[0].length; j++){ 
        sum+= board[targetRow][j].getPoints(); 
        String color = board[targetRow][0].getColor(); 
        if (!(board[targetRow][j].getColor().equals(color))){
            word = false; 
        }
    }
    if (word) {
        sum*=2; 
    }
    return sum; 
}
