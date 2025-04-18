package org.learning.cricbuzz.pullMethod;

public class Cricbuzz {

    private int runs;
    private int wickets;
    private int overs;

    private IccApiService iccApiService;

    public Cricbuzz() {
        iccApiService = new IccApiService(0, 0, 0);
    }

    public void updateScore(int runs, int wickets, int overs) {

        while (true) {

            iccApiService.updateScore(runs, wickets, overs);

            if (this.overs == iccApiService.getOvers()) {

                this.runs = iccApiService.getRuns();
                this.wickets = iccApiService.getWickets();
                this.overs = iccApiService.getOvers();
                System.out.println("Runs: " + runs + " Wickets: " + wickets + " Overs: " + overs);
            }
        }
    }
}
