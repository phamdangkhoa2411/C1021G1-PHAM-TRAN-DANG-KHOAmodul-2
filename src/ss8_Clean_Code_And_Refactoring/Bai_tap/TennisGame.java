package ss8_Clean_Code_And_Refactoring.Bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int Player1, int Player2) {
        String score ="";
        int tempScore=0;
        if (Player1 == Player2)
        {
            score = getDraw(Player1);
        }
        else if (Player1 >=4 || Player2 >=4)
        {
            score = whoWin(Player1, Player2);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = Player1;
                else { score+="-"; tempScore = Player2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getDraw(int Player1) {
        String score;
        switch (Player1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce"  ; // Deuce = hòa
                break;

        }
        return score;
    }

    private static String whoWin(int Player1, int Player2) {
        String score;
        int minusResult = Player1 - Player2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}
