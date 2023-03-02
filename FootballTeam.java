public class FootballTeam {
    String teamName ;
    String country ;
    int rating;
    String[] players = new String[11]; //created array with 11 places

    public FootballTeam(String teamName, String country, int rating, String[] players) {
        this.teamName = teamName;
        this.country = country;
        this.rating = rating;
        this.players = players;
    }

    public FootballTeam(String teamName, String country) {
        this.teamName = teamName;
        this.country = country;

    }


    public void printTeam() {
        System.out.println(teamName);
        for (int i = 0; i < this.players.length ; i++) {
            System.out.print(this.players[i] + " ");
        }
        System.out.println();
    }

    public void changePlayers (String playerToChange, String newPlayer) {
        for (int i = 0; i < this.players.length ; i++) {
            if (this.players[i].equals(playerToChange)) {
                this.players[i] = newPlayer;
                break;
            }
        }
    }

    public void changeRating(int otherRating) {
        this.rating = otherRating;
    }

}
