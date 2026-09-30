public class LetturaSensore {

    private Double temperatura;
    private Integer umiditaPercentuale;
    private Long timestampUnix;
    private Boolean batteriaScarica;

    public LetturaSensore(Double temp, Integer umid) {
        this.temperatura = temp;
        this.umiditaPercentuale = umid;
    }

    public static void parsePacchetto(String raw) {
        String[] parti = raw.split(";");
        for (String parte : parti) {
            String[] coppia = parte.split("=");

            if (coppia[0].equals("temp")) {
                Double temp = Double.valueOf(coppia[1]);
                System.out.println("Temperatura letta: " + temp);
            }
            if (coppia[0].equals("umid")) {
                Integer umid = Integer.valueOf(coppia[1]);
            }
        }
    }
}