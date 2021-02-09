public static String ticTacToe( String game ) {
        char board[][] = new char[3][3];
        int pos = 0;
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                board[r][c] = game.charAt(pos);
                pos ++;
            }
        }
        if(board[0][0]==board[0][1] && board[0][1]==board[0][2]) 
        return String.valueOf(board[0][0]);
        if(board[1][0]==board[1][1] && board[1][1]==board[1][2]) 
        return String.valueOf(board[1][0]);
        if(board[2][0]==board[2][1] && board[2][1]==board[2][2]) 
        return String.valueOf(board[2][0]);
        if(board[0][0]==board[1][0] && board[2][0]==board[1][0]) 
        return String.valueOf(board[0][0]);
        if(board[0][1]==board[1][1] && board[2][1]==board[1][1]) 
        return String.valueOf(board[0][1]);
        if(board[0][2]==board[1][2] && board[2][2]==board[1][2]) 
        return String.valueOf(board[0][2]);
        if(board[0][0]==board[1][1] && board[2][2]==board[1][1]) 
        return String.valueOf(board[0][0]);
        if(board[2][0]==board[1][1] && board[1][1]==board[0][2]) 
        return String.valueOf(board[0][2]);
        return "";
    }
